plugins {
    kotlin("js") version "1.7.10"
}

group = "com.jianastrero"
version = "0.1.0"

repositories {
    mavenCentral()
}

kotlin {
    js {
        browser {
        }
        binaries.executable()
    }
}

dependencies {
    testImplementation(kotlin("test-js"))
}