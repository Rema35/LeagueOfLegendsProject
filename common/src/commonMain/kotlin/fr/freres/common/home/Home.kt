package fr.freres.common.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun HomeScreen(onProfileClick: () -> Unit) {
    val vm = remember{HomeViewModel()}
    var text by remember { mutableStateOf("") }

    Column {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it }
        )

        Button(onClick = {
            // 1. vérifier que le nom de l'utilisateur est non vide
            if(text.isEmpty()) {
                return@Button
            }
            // 2. appeler l'api de riot game pour récupérer les informations du joueur
            vm.getLevel(text)
            // https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name/NOM_DU_JOUEUR?api_key=RGAPI-321dfa48-170c-4ff7-bf53-b55994bbcc67

            onProfileClick()
        }) {
            Text("Click me")
        }
        Text("summonerName")
    }
}