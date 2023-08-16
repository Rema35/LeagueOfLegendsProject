import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import fr.freres.common.App


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
