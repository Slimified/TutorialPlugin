group = "me.slimified"
version = "1.0.0"

plugins {
    id("java")
    id("xyz.jpenilla.run-paper") version "2.3.0"
}

repositories {
    maven {
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
    mavenCentral()
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21-R0.1-SNAPSHOT")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks {
    runServer {
        minecraftVersion("1.21")
    }
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}