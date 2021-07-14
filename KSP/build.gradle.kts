import android.deepdive.ksp.Dependencies

plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
    google()
}

dependencies {

    Dependencies.Kotlin.run {
        implementation(kotlinStdLib)
    }

    Dependencies.Ksp.run {
        implementation(kspApi)
    }
}