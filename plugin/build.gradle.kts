plugins {
    id("java-gradle-plugin")
    kotlin("jvm")
    id("maven-publish")
    id("com.gradle.plugin-publish")
}

sourceSets.configureEach {
    java.srcDirs("src/$name/kotlin")
}

group = "org.sample.plugin"
version = "1.0.0-SNAPSHOT"

java {
    withSourcesJar()
    withJavadocJar()
}

gradlePlugin {
    plugins {
        create("plugin") {
            id = "org.sample.plugin"
            displayName = "Sample Plugin"
            description = "A Sample Plugin"
            implementationClass = "org.sample.GreetingPlugin"
        }
    }
}

pluginBundle {
    website = "https://github.com/example/example"
    vcsUrl = "https://github.com/example/example"
    tags = listOf("example")
}
