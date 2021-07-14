import android.deepdive.ksp.Dependencies

plugins {
    id ("com.android.application")
    id ("kotlin-android")
}

android {
    compileSdkVersion(Dependencies.compileSdkVersion)
    buildToolsVersion(Dependencies.buildToolsVersion)

    defaultConfig {
        applicationId("android.deepdive.ksp.sample")
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

    Dependencies.AndroidX.run {
        implementation(coreKtx)
        implementation(appcompat)
        implementation(constraintLayout)
    }

    Dependencies.Google.run {
        implementation(material)
    }

    Dependencies.Test.run {
        testImplementation(junit)
    }

    Dependencies.AndroidTest.run {
        androidTestImplementation(junit)
        androidTestImplementation(espresso)
    }
}