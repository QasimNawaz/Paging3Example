object Dependencies {
    const val gradle = "com.android.tools.build:gradle:4.0.0"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val materialDesign = "com.google.android.material:material:${Versions.materialVersion}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val annotation = "androidx.annotation:annotation:${Versions.androidxAnnotations}"
    const val legacySupport = "androidx.legacy:legacy-support-v4:${Versions.androidxLegacySupport}"
    const val lifeCycleCommonJava =
        "androidx.lifecycle:lifecycle-common-java8:${Versions.archLifecycleVersion}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerViewVersion}"
    const val cardView = "com.android.support:cardview-v7:${Versions.cardViewVersion}"
    const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"

    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtxVersion}"

    const val ktxCore = "androidx.core:core-ktx:${Versions.ktxCore}"
}

object Coroutines {
    const val core =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCoreVersion}"
    const val android =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroidVersion}"
}

object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit2Version}"
    const val converterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit2Version}"
    const val interCepter =
        "com.squareup.okhttp3:logging-interceptor:${Versions.retrofitInterceptor}"
}

object Room {
    const val runtime = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val ktx = "androidx.room:room-ktx:${Versions.roomVersion}"
    const val compiler = "androidx.room:room-compiler:${Versions.roomVersion}"
}

object ViewModelLifeCycle {
    const val lifeCycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycle}"
    const val lifCycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycle}"
    const val lifeCycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifeCycle}"
    const val lifeCycleExtension = "androidx.lifecycle:lifecycle-extensions:${Versions.lifeCycle}"
}

object Hilt {
    const val hilt = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
    const val compiler = "com.google.dagger:hilt-android-compiler:${Versions.hiltVersion}"
    const val plugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltVersion}"
    const val viewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltLifeCycleVersion}"
    const val viewModelCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltLifeCycleVersion}"
}

object Glide {
    const val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
    const val compiler = "com.github.bumptech.glide:compiler:${Versions.glideCompilerVersion}"
}

object Testing {
    const val jUnit = "junit:junit:${Versions.junitVersion}"
    const val extJUnit = "androidx.test.ext:junit:${Versions.androidxTestVersion}"
}

object KotlinAnko {
    const val anko = "org.jetbrains.anko:anko:${Versions.ankoVersion}"
}

object Groupie {
    const val groupie = "com.xwray:groupie:${Versions.groupieVersion}"
    const val groupieDatabinding = "com.xwray:groupie-databinding:${Versions.groupieVersion}"
    const val groupieExtension =
        "com.xwray:groupie-kotlin-android-extensions:${Versions.groupieVersion}"
}

object Shimmer {
    const val shimmer = "com.facebook.shimmer:shimmer:${Versions.shimmer}"
}

object Paging {
    const val paging = "androidx.paging:paging-runtime-ktx:${Versions.pagingVersion}"
}

object Navigation {
    const val navigationFrgKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navVersion}"
    const val navigationUIKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navVersion}"
    const val navigationDynFeature = "androidx.navigation:navigation-dynamic-features-fragment:${Versions.navVersion}"
}