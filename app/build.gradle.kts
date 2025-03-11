plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.adityamadjidloginregister"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.adityamadjidloginregister"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // ConstraintLayout versi terbaru (mengatasi error atribut yang hilang)
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

// ViewBinding (untuk mempermudah akses view tanpa findViewById)
    implementation("androidx.databinding:viewbinding:8.2.0")

// Kotlin Coroutines (untuk operasi asynchronous yang efisien)
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")

// Timber (untuk logging yang lebih rapi)
    implementation("com.jakewharton.timber:timber:5.0.1")


    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

}