plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}
android {
    compileSdkVersion(AppConfiguration.compileSdkVersion)
    buildToolsVersion(AppConfiguration.buildToolsVersion)

    defaultConfig {
        applicationId = AppConfiguration.applicationId
        minSdkVersion(AppConfiguration.minSdkVersion)
        targetSdkVersion(AppConfiguration.targetSdkVersion)
        versionCode = AppConfiguration.versionCode
        versionName = AppConfiguration.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("String", "BASE_URL", "\"" + AppConfiguration.DEV_BASE_URL + "\"")
        }
        getByName("debug") {
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-DEV"
            isDebuggable = true
            buildConfigField("String", "BASE_URL", "\"" + AppConfiguration.DEV_BASE_URL + "\"")
        }
        create("staging") {
            applicationIdSuffix = ".staging"
            versionNameSuffix = "-STG"
            isDebuggable = true
            buildConfigField("String", "BASE_URL", "\"" + AppConfiguration.STG_BASE_URL + "\"")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }

}

dependencies {
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${rootProject.extra["kotlinVersion"]}")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    // Dependencies for Android Support
    implementation(Dependencies.appCompat)
    implementation(Dependencies.materialDesign)
    implementation(Dependencies.constraintLayout)
    implementation(Dependencies.annotation)
    implementation(Dependencies.legacySupport)
    implementation(Dependencies.recyclerView)
    implementation(Dependencies.cardView)
    implementation(Dependencies.ktxCore)


    // Dependencies for Architecture Component
    implementation(Dependencies.appCompat)
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    kapt(Dependencies.lifeCycleCommonJava)

    // Dependencies for Room
    implementation(Room.runtime)
    implementation(Room.ktx)
    kapt(Room.compiler)

    // Dependencies for Hilt
    implementation(Hilt.hilt)
    implementation(Hilt.viewModel)
    kapt(Hilt.compiler)
    kapt(Hilt.viewModelCompiler)

    // Dependencies for Glide
    implementation(Glide.glide)
    kapt(Glide.compiler)

    // Dependencies for Testing
    testImplementation(Testing.jUnit)
    androidTestImplementation(Testing.extJUnit)

    // Retrofit2
    implementation(Retrofit.retrofit)
    implementation(Retrofit.converterGson)
    implementation(Retrofit.interCepter)

    // Coroutines
    implementation(Coroutines.core)
    implementation(Coroutines.android)

    // Gson
    implementation(Dependencies.gson)

    // Ktx
    implementation(Dependencies.fragmentKtx)

    // Anko
    implementation(KotlinAnko.anko)

    // Groupie
    implementation(Groupie.groupie)
    implementation(Groupie.groupieDatabinding)
    implementation(Groupie.groupieExtension)

    // Paging
    implementation(Paging.paging)

    // Shimmer Loading
    implementation(Shimmer.shimmer)

    //ViewModel and LifeCycle
    implementation(ViewModelLifeCycle.lifCycleViewModel)
    implementation(ViewModelLifeCycle.lifeCycleExtension)
    implementation(ViewModelLifeCycle.lifeCycleLiveData)
    implementation(ViewModelLifeCycle.lifeCycleRuntime)

    //Navigation component
    implementation(Navigation.navigationFrgKtx)
    implementation(Navigation.navigationUIKtx)
    implementation(Navigation.navigationDynFeature)
}