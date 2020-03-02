
buildscript {
    repositories {
        google()
        jcenter()
        maven(url  = "https://maven.fabric.io/public")

    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(url = "https://jitpack.io")

    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
