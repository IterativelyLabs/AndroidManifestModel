plugins {
    kotlin("jvm") version "1.3.61"
}

group = "uk.co.iteratively"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.10.2")
    implementation("com.fasterxml.jackson.module:jackson-modules-base:2.10.2")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.10.2")

    testImplementation("junit:junit:4.13")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}