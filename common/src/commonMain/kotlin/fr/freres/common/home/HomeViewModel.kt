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

        runBlocking { // this: CoroutineScope
            launch {
                val response = client.get(
                    "https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name/$summonerName?api_key=RGAPI-321dfa48-170c-4ff7-bf53-b55994bbcc67")
                val stringBody: String = response.body()
                println(stringBody)
            }

        }
    }
}