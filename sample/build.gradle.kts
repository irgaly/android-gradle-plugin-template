plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.sampleplugin)
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "org.sample.app"
        minSdk = 26
        targetSdk = 31
        versionCode = 1
        versionName = "1.0.0"
    }
    buildFeatures {
        dataBinding = true
    }
}

greeting {
    who = "mate"
}

dependencies {
    implementation(libs.androidx.core)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.material)
    implementation(libs.androidx.constraintlayout)
}
