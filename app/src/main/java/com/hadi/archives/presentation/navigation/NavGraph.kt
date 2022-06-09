package com.hadi.archives.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hadi.archives.presentation.screens.details.BookDetailsScreen
import com.hadi.archives.presentation.screens.home.HomeScreen
import com.hadi.archives.presentation.screens.splash.SplashScreen
import com.hadi.archives.presentation.screens.welcome.WelcomeScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Welcome.route
    ) {

        composable(route = Screen.Splash.route){
            SplashScreen(navController = navController)
        }

        composable(route = Screen.Welcome.route){
            WelcomeScreen(navController = navController)
        }

        composable(route = Screen.Home.route){
            HomeScreen(navController = navController)
        }

        composable(route = Screen.Details.route.plus("/{bookId}")){
            val bookId = it.arguments?.getString("bookId") ?: ""
            BookDetailsScreen(navController = navController, bookId = bookId)
        }

    }
}