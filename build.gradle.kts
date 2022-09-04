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

task("copyResources") {
    copy {
        from("src/main/resources")
        into("out")
    }
}

//task("afterBundle") {
//    dependsOn("bundle")
//    copy {
//        from ("build/bundle") {
//            rename("(.*)\\\\.bundle.js", "\$1.js")
//        }
//        into("out")
//    }
//}


tasks.findByPath("assemble")?.dependsOn("copyResources")