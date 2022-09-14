import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

project.ext {
    set("spockVersion", "2.0-groovy-3.0")
}
dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.spockframework:spock-core:${property("spockVersion")}")
    testImplementation("org.spockframework:spock-spring:${property("spockVersion")}")
    testImplementation("org.spockframework:spock-core")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}