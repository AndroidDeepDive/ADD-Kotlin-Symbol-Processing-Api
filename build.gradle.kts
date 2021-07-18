plugins {
    kotlin("jvm") version "1.5.20" apply false
}

buildscript {
    val kotlinVersion by extra("1.5.20")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
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
