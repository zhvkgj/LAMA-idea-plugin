plugins {
    // Kotlin support
    id("org.jetbrains.kotlin.jvm") version "1.4.21"
    id("org.jetbrains.intellij") version "0.7.3"
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
version = "1.0-SNAPSHOT"
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
    version = "IC-2020.1"
    pluginName = myPluginName
    setPlugins("com.intellij.java")
}


tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
tasks.getByName<org.jetbrains.intellij.tasks.PatchPluginXmlTask>("patchPluginXml") {
    changeNotes("""
      Add change notes here.<br>
      <em>most HTML tags may be used</em>""")
}
tasks.compileJava {
    options.release.set(11)
}