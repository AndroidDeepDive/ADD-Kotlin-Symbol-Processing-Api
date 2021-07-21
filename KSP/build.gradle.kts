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
        implementation(poet)
    }

    Dependencies.Ksp.run {
        implementation(kspApi)
    }

}
