plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.kotlin.android.extensions")
}

androidExtensions { isExperimental = true }

android {
    compileSdkVersion(Project.Android.compileSdkVersion)

    defaultConfig {
        versionName = Library.version
        versionCode = 1
        minSdkVersion(Project.Android.minSdkVersion)
        targetSdkVersion(Project.Android.targetSdkVersion)
        testInstrumentationRunner = Project.Android.testInstrumentationRunner
    }
    packagingOptions {
        exclude("META-INF/*kotlin*")
    }
}

dependencies {
    implementation(project(":survey"))

    implementation(Deps.Test.core)
    implementation(Deps.Test.rules)
    implementation(Deps.Test.runner)
    implementation(Deps.Test.jUnitJupiter)
    implementation(Deps.Test.jUnitPlatform)
    implementation(Deps.Test.junitExt)
    implementation(Deps.Test.espresso)
    implementation(Deps.Test.espressoContribs)
}
