# Android Gradle Plugin Template

Template repository for modern Android Gradle Plugin Project.

* Kotlin 1.7.20
* Android Gradle Plugin 7.3.0
  * Sample App's compileSdk = 31 (Android 12)
  * Sample App's minSdk = 26 (Android 8.0)
* Gradle 7.5.1
  * Version Catalog
  * Kotlin DSL (*.kts)
  * pluginManagement / dependencyResolutionManagement (settings.gradle.kts)
  * Composite Build
  * mavenPublish + publish to Maven Plugin Portal

## Publish Plugin

docs: https://docs.gradle.org/current/userguide/publishing_gradle_plugins.html

* register Maven Plugin Portal Account
  * https://plugins.gradle.org/user/register
  * Using login with Github account is recommended to use `io.github.{user}.{plugin}` plugin id.

Set your API Key to gradle.properties, or specify it as command line arguments.

`~/.gradle/gradle.properties`

```properties
gradle.publish.key=...
gradle.publish.secret=...
```

Configure your plugin publications.

Plugin id must have your owned domain or `io.github.{user}`. see this
document: https://plugins.gradle.org/docs/publish-plugin#approval

`plugin/build.gradle.kts`

```kotlin
group = "io.github.{user}.{plugin name}" // maven artifact groupId, it's recommended to same as plugin id.
version = "0.1.0"

gradlePlugin {
    plugins {
        create("plugin") { // unique name in your config
            id = "io.github.{user}.{plugin name}" // plugin id
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
