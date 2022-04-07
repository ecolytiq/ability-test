plugins {
    kotlin("jvm") version "1.6.10"
}

group = "com.ecolytiq"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    // https://mvnrepository.com/artifact/org.assertj/assertj-core
    testImplementation("org.assertj:assertj-core:3.22.0")

    implementation(kotlin("stdlib"))
}

tasks.withType<Test> {

    useJUnitPlatform()
}
