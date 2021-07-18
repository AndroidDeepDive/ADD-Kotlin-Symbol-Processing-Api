package android.deepdive.ksp.interfaceimplementation.processor

import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.validate
import android.deepdive.ksp.interfaceimplementation.InterfaceImplementation

class InterfaceImplementationProcessor : SymbolProcessor {

    private lateinit var codeGenerator: CodeGenerator
    private lateinit var logger: KSPLogger


    companion object {
        private val annotationName = InterfaceImplementation::class.java.canonicalName
        private val filteringKeywords = arrayOf("equals", "hashCode", "toString", "<init>")
    }

    fun init(
        codeGenerator: CodeGenerator,
        logger: KSPLogger
    ) {
        this.codeGenerator = codeGenerator
        this.logger = logger
    }

    override fun process(resolver: Resolver): List<KSAnnotated> {
        logger.warn("Processor 시작")

        val symbols = resolver.getSymbolsWithAnnotation(annotationName)

        logger.warn("symbols : $symbols")

        val ret = symbols.filter { !it.validate() }

        symbols
            .filter {
                logger.warn("symbol : $it")
                it is KSClassDeclaration && it.validate()
            }
            .forEach { it.accept(InterfaceImplementationVisitor(codeGenerator, logger, annotationName, filteringKeywords), Unit) }

        return ret.toList()
    }

    override fun finish() {
        logger.warn("Processor 끝")
    }

    override fun onError() {
        logger.error("Processor 에러")
    }
}

class AbstractionProcessorProvider : SymbolProcessorProvider {

    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        return InterfaceImplementationProcessor().apply {
            init(environment.codeGenerator, environment.logger)
        }
    }

}
