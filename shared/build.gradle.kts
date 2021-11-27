plugins {
    kotlin("multiplatform")
    id("com.android.library")
    kotlin("android.extensions")
    id("maven-publish")
}

repositories {
    google()
    mavenCentral()
}

android {
    compileSdkVersion(21)
    defaultConfig {
        minSdkVersion(21)
    }
    sourceSets {
        getByName("main") {
            manifest.srcFile("src/androidMain/AndroidManifest.xml")
            java.srcDirs(file("src/androidMain/kotlin"))
            res.srcDirs(file("src/androidMain/res"))
        }
    }
}

kotlin {
    android {
        publishAllLibraryVariants()
        publishLibraryVariantsGroupedByFlavor = true
        mavenPublication {
            artifactId = "shared-android"
        }
    }
    jvm {
        val main by compilations.getting {
            kotlinOptions {
                // Setup the Kotlin compiler options for the 'main' compilation:
                jvmTarget = JavaVersion.VERSION_11.majorVersion
            }
        }

        compilations["test"].runtimeDependencyFiles // get the test runtime classpath
    }
    js("nodeJs")

    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation("com.squareup.moshi:moshi-kotlin:1.9.2")
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }

        val nodeJsMain by getting
        val nodeJsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }

        val androidMain by getting {
            dependencies {
                implementation("com.squareup.retrofit2:converter-moshi:2.7.0")
            }
        }
    }
}
