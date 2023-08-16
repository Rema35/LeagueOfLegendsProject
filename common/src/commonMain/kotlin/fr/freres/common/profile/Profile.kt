package fr.freres.common.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ProfileScreen(onBack: () -> Unit) {
    Column {
        Text("Profile")

        Button(onClick = onBack) {
            Text("Click me")
        }
    }
}