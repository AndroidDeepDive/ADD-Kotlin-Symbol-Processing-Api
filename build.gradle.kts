buildscript {
    val kotlinVersion by extra(android.deepdive.ksp.Dependencies.kotlinVersion)
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(android.deepdive.ksp.Dependencies.ClassPath.androidGradle)
        classpath(android.deepdive.ksp.Dependencies.ClassPath.kotlin)
        classpath(android.deepdive.ksp.Dependencies.ClassPath.ksp)
        classpath(kotlin("gradle-plugin", version = kotlinVersion))
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
