package com.hadi.archives.presentation.navigation

sealed class Screen(val route: String) {

    object Splash : Screen("splash_screen")
    object Welcome : Screen("welcome_screen")
    object Home : Screen("home_screen")
    object Details : Screen("details_screen")

}