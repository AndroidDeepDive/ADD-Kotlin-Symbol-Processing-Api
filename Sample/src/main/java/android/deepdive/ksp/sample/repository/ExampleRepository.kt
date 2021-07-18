package android.deepdive.ksp.sample.repository

import android.deepdive.ksp.interfaceimplementation.InterfaceImplementation

@InterfaceImplementation
class ExampleRepository {

    fun getData(a: Int, b: Int): Int {
        return a + b
    }

}
