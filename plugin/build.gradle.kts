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
    website.set("https://github.com/example/example")
    vcsUrl.set("https://github.com/example/example")
    plugins {
        create("plugin") {
            id = "org.sample.plugin"
            displayName = "Sample Plugin"
            description = "A Sample Plugin"
            tags.set(listOf("example"))
            implementationClass = "org.sample.GreetingPlugin"
        }
    }
}
