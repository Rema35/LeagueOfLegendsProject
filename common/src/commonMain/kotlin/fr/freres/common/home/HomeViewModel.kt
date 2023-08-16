package fr.freres.common.home
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class HomeViewModel{
    fun getLevel(summonerName: String){
        val client = HttpClient(CIO)
        val summonerNameModifier = summonerName.replace(" ", "%20").trim()

        runBlocking { // this: CoroutineScope
            launch {
                val response = client.get(
                    "https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name/$summonerNameModifier?api_key=RGAPI-d7f2ef17-de5b-451b-9d78-2d4e45ed91e4")
                val stringBody: String = response.body()
                println(stringBody)
            }

        }
    }
}