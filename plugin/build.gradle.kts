plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.publish)
}

group = "org.sample.plugin"
version = libs.versions.sampleplugin.get()

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
