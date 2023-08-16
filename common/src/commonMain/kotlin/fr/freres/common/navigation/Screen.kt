package fr.freres.common.navigation

sealed class Screen {

    object Home : Screen()

    object Profile : Screen()

    object Match : Screen()
}
