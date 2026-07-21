plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.sampleplugin)
}

android {
    namespace = "org.sample.app"
    compileSdk = 37
    defaultConfig {
        applicationId = "org.sample.app"
        minSdk = 33
        targetSdk = 37
        versionCode = 1
        versionName = "1.0.0"
    }
}

kotlin {
    jvmToolchain(libs.versions.gradle.jvmToolchain.get().toInt())
}

greeting {
    who = "mate"
}

dependencies {
    implementation(dependencies.platform(libs.compose.bom))
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.lifecycle)
    implementation(libs.bundles.compose)
}
