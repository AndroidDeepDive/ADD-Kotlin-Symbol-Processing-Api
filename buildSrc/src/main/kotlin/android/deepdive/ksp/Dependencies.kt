package android.deepdive.ksp

object Dependencies {

    const val compileSdkVersion = 30
    const val buildToolsVersion = "30.0.3"
    const val minSdkVersion = 16
    const val targetSdkVersion = 30

    const val kotlinVersion = "1.5.20"

    const val androidGradleVersion = "4.2.2"

    const val kspVersion = "1.5.20-1.0.0-beta04"

    object ClassPath {
        const val androidGradle = "com.android.tools.build:gradle:$androidGradleVersion"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
        const val ksp = "com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:$kspVersion"
    }

    object Kotlin {
        const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
        const val poet = "com.squareup:kotlinpoet:1.7.2"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.5.0"
        const val appcompat = "androidx.appcompat:appcompat:1.3.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"
    }

    object Google {
        const val material = "com.google.android.material:material:1.3.0"
    }

    object Test {
        const val junit = "junit:junit:4.+"
    }

    object AndroidTest {
        const val junit = "androidx.test.ext:junit:1.1.2"
        const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
    }

    object Ksp {
        const val kspApi = "com.google.devtools.ksp:symbol-processing-api:1.5.20-1.0.0-beta04"
    }
}
