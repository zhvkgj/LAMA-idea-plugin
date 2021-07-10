import org.jetbrains.grammarkit.tasks.GenerateLexer
import org.jetbrains.grammarkit.tasks.GenerateParser

plugins {
    // Kotlin support
    id("org.jetbrains.kotlin.jvm") version "1.4.21"
    id("org.jetbrains.intellij") version "1.1.2"
    id("org.jetbrains.grammarkit") version "2021.1.3"
    java
}

java {
    sourceSets {
        main {
            java.setSrcDirs(listOf("src/main/gen", "src/main/java"))
        }
    }
}

group = "org.example"
version = "1.1.1"
val myPluginName = "Plama"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version.set("2021.1.3")
    pluginName.set(myPluginName)
}

task<GenerateLexer>("generateLamaLexer") {
    group = "generation"
    source = "src/main/grammar/LamaLexer.flex"
    targetDir = "src/main/gen/ru/mse/itmo/lama/language"
    targetClass = "_LamaLexer"
    purgeOldFiles = true
}

task<GenerateParser>("generateLamaParser") {
    group = "generation"
    source = "src/main/grammar/LamaParser.bnf"
    targetRoot = "src/main/gen"
    pathToParser = "/ru/mse/itmo/lama/language/parser/RustParser.java"
    pathToPsiRoot = "/ru/mse/itmo/lama/language/psi"
    purgeOldFiles = true
}

tasks.clean {
    delete("${rootDir}/src/main/gen/ru")
}

tasks {
    patchPluginXml {
        changeNotes.set("Simple syntax highlighting and auto complete")
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.compileJava {
    options.release.set(11)
}