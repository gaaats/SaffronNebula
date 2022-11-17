package com.omer.ropeanddemolish

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.omer.ropeanddemolish.ApApApClass.Companion.C1
import com.omer.ropeanddemolish.ApApApClass.Companion.jsoupCheck
import com.omer.ropeanddemolish.ApApApClass.Companion.linkFilterPart1
import com.omer.ropeanddemolish.ApApApClass.Companion.linkFilterPart2
import com.omer.ropeanddemolish.ApApApClass.Companion.odone
import com.omer.ropeanddemolish.gamegame.GgggggggameActivity
import kotlinx.coroutines.*
import java.net.HttpURLConnection
import java.net.URL

class FiiillllfillterActivity : AppCompatActivity() {
    lateinit var jasika: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fiiillllfillter)
        jasika = ""
        val johny = GlobalScope.launch(Dispatchers.IO) {
            jasika = corovka()
        }

        runBlocking {
            try {
                johny.join()

                if (jasika == jsoupCheck) {
                    Intent(
                        applicationContext,
                        GgggggggameActivity::class.java
                    ).also { startActivity(it) }
                } else {
                    Intent(
                        applicationContext,
                        VibivibiVievActivity::class.java
                    ).also { startActivity(it) }
                }
                finish()
            } catch (e: Exception) {

            }
        }

    }

    private fun gogik(lyonka: String) {
        val ukirka = URL(lyonka)
        val ukurok = ukirka.openConnection() as HttpURLConnection

        try {
            val toxic = ukurok.inputStream.bufferedReader().readText()
            if (toxic.isNotEmpty()) {
                jasika = toxic
            } else {
            }
        } catch (ex: Exception) {

        } finally {
            ukurok.disconnect()
        }
    }

    private suspend fun corovka(): String {
        val shaman = getSharedPreferences("SP", MODE_PRIVATE)
        val hawkaaa: String? = shaman.getString(C1, "null")
        val forJsoupSetNaming =
            "${linkFilterPart1}${linkFilterPart2}${odone}$hawkaaa"

        withContext(Dispatchers.IO) {
            gogik(forJsoupSetNaming)
        }
        return jasika
    }


}