package fr.freres.common.navigation

import androidx.compose.runtime.*
import fr.freres.common.home.HomeScreen
import fr.freres.common.profile.ProfileScreen

@Composable
fun Navigation() {
    var currentScreen by remember { mutableStateOf<Screen>(Screen.Home) }

    when (currentScreen) {
        Screen.Home -> HomeScreen(
            onProfileClick = {
                currentScreen = Screen.Profile
            })

        Screen.Profile -> ProfileScreen(
            onBack = {
                currentScreen = Screen.Home
            })

        Screen.Match -> TODO()
    }
}