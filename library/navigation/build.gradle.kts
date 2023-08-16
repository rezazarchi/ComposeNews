plugins {
    id("composenews.android.library")
    id("composenews.android.library.compose")
}

android {
    namespace = "ir.composenews.navigation"
}

dependencies {
    implementation(project(":feature:marketlist"))
    implementation(project(":feature:marketdetail"))
    implementation(project(":domain:market"))
    api(libs.navigation.compose)
}