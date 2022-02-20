buildscript {
    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.5.31"))
        classpath("com.android.tools.build:gradle:3.6.4")
    }
}

subprojects {
    group = "com.weesnerdevelopment"
    version = if (version != "unspecified") version else "1.6.5"

    repositories {
        jcenter()
        google()
    }
}
