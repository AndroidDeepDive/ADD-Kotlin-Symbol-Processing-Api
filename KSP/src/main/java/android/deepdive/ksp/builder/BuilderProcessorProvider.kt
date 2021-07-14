package android.deepdive.ksp.builder

import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider

/*
 * [Step 2]
 * Implement SymbolProcessorProvider.create() to create a SymbolProcessor.
 *
 * Dependencies your processor needs (e.g. CodeGenerator, processor options) are passed through the parameters of SymbolProcessorProvider.create().
 */
class BuilderProcessorProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        return BuilderProcessor(environment.codeGenerator, environment.logger)
    }
}