# Android Gradle Plugin Template

Template repository for modern Android Gradle Plugin Project.

* Kotlin 1.6.10
* Android Gradle Plugin 7.0.1
  * compileSdk = 31 (Android 12)
  * minSdk = 26 (Android 8.0)
* Gradle 7.3.3
  * Version Catalog
  * Kotlin DSL (*.kts)
  * pluginManagement / dependencyResolutionManagement (settings.gradle.kts)
  * Composite Build
  * mavenPublish + publish to Maven Plugin Portal

## Publish Plugin

docs: https://docs.gradle.org/current/userguide/publishing_gradle_plugins.html

* register Maven Plugin Portal Account
  * https://plugins.gradle.org/user/register

Set your API Key to `~/.gradle/gradle.properties`, or specify it as command line arguments.

```properties
gradle.publish.key=...
gradle.publish.secret=...
```

Configure your plugin publications.

`plugin/build.gradle.kts`

```
gradlePlugin {
    plugins {
        create("plugin") { // unique name in your config
            id = "org.sample.plugin" // plugin id
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
```

publish command

```shell
./gradle :plugin:publishPlugins
```

or command with API Key args

```shell
./gardlew :plugin:publishPlugins -Pgradle.publish.key=<key> -Pgradle.publish.secret=<secret>
```
