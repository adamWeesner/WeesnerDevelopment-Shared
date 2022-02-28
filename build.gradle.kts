buildscript {
    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.6.10"))
        classpath("com.android.tools.build:gradle:7.0.4")
    }
}

subprojects {
    group = "com.weesnerdevelopment"
    version = if (version != "unspecified") version else "1.6.6"

    repositories {
        mavenCentral()
        google()
    }
}
