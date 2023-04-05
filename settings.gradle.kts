enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "android-gradle-plugin-template"
include(":sample")
// if you want to use your plugin from Maven Plugin Portal, comment out below `includeBuild("plugin")` line.
includeBuild("plugin")
