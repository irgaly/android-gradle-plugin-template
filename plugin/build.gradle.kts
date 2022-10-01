plugins {
    kotlin("jvm")
    alias(libs.plugins.publish)
}

sourceSets.configureEach {
    java.srcDirs("src/$name/kotlin")
}

group = "org.sample.plugin"
version = "0.1.0"

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
