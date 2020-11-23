buildscript {
    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.3.72"))
        classpath("com.android.tools.build:gradle:3.6.3")
    }
}

subprojects {
    group = "com.weesnerdevelopment"
    version = if (version != "unspecified") version else "1.5.2"

    repositories {
        jcenter()
        google()
    }
}
