buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Build.androidBuildTools)
        classpath(Build.hiltAndroidGradlePlugin)
        classpath(Build.kotlinGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    }

}
//plugins {
//    id 'com.android.application' version '7.1.0' apply false
//    id 'com.android.library' version '7.1.0' apply false
//    id 'org.jetbrains.kotlin.android' version '1.5.30' apply false
//    id 'org.jetbrains.kotlin.jvm' version '1.5.30' apply false
//}

tasks.register("clean", Delete::class){
    delete(rootProject.buildDir)
}