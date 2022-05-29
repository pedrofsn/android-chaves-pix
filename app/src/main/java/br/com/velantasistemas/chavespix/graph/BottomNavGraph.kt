package br.com.velantasistemas.chavespix.graph

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.velantasistemas.chavespix.screens.BottomBarMenu
import br.com.velantasistemas.chavespix.screens.FakeScreen

@Composable
fun BottomNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = BottomBarMenu.Home.route
    ) {
        composable(route = BottomBarMenu.Home.route) {
            FakeScreen(name = "Home", color = Color.Blue)
        }
        composable(route = BottomBarMenu.Profile.route) {
            FakeScreen(name = "Profile", color = Color.Cyan)
        }
        composable(route = BottomBarMenu.Settings.route) {
            FakeScreen(name = "Home", color = Color.Red)
        }
    }
}
