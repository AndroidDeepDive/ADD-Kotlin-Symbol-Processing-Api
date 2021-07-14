import android.deepdive.ksp.Dependencies

plugins {
    id ("com.android.library")
    id ("kotlin-android")
    kotlin("jvm")
}

android {
    compileSdkVersion(Dependencies.compileSdkVersion)
    buildToolsVersion(Dependencies.buildToolsVersion)

    defaultConfig {
        minSdkVersion(Dependencies.minSdkVersion)
        targetSdkVersion(Dependencies.targetSdkVersion)
        versionCode(1)
        versionName("1.0")

        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }

    buildTypes {
    }

    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {

    Dependencies.Kotlin.run {
        implementation(kotlinStdLib)
    }

    Dependencies.Ksp.run {
        implementation(kspApi)
    }
}