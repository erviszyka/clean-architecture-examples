buildscript {
    repositories {
        maven {
             url = uri("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
    }
}
subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
    }

    group = "org.example"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }

    val implementation by configurations
    dependencies {
        implementation(kotlin("stdlib-jdk8"))
    }
//    tasks {
//        compileKotlin {
//            kotlinOptions.jvmTarget = "1.8"
//        }
//        compileTestKotlin {
//            kotlinOptions.jvmTarget = "1.8"
//        }
//    }
}