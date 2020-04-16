plugins {
    kotlin("multiplatform") version "1.3.71"
    id("maven-publish")
}

group = "com.weesnerdevelopment"
version = "1.0.2"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        val main by compilations.getting {
            kotlinOptions {
                // Setup the Kotlin compiler options for the 'main' compilation:
                jvmTarget = "1.8"
            }
        }

        compilations["test"].runtimeDependencyFiles // get the test runtime classpath
    }
    js("nodeJs")

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
                implementation("com.squareup.moshi:moshi-kotlin:1.9.2")
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }

        val nodeJsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }

        val nodeJsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}
