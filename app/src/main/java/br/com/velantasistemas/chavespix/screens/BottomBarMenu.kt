package br.com.velantasistemas.chavespix.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarMenu(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home: BottomBarMenu(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Profile: BottomBarMenu(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )
    object Settings: BottomBarMenu(
        route = "settings",
        title = "Settings",
        icon = Icons.Default.Settings
    )
}
