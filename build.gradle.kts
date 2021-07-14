plugins {
    kotlin("jvm") version "1.5.20" apply false
}

buildscript {
    val kotlin_version by extra("1.5.21")
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.20")
        classpath(kotlin("gradle-plugin", version = "1.5.20"))
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter() // Warning: this repository is going to shut down soon
    }
}

//tasks.register("clean". Delete::class) {
//    delete(rootProject.buildDir)
//}