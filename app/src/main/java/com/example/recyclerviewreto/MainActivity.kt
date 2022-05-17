package com.example.recyclerviewreto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewreto.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeProductData: Array<JSONObject> = arrayOf(
            JSONObject("{\"product\": \"Lechera Nestle 250g\", \"rating\": \"4\", \"reviews\": \"600 reviews\", \"cost\": \"$20\"}"),
            JSONObject("{\"product\": \" Nescafe Capuchino Moka\", \"rating\": \"4.5\", \"reviews\": \"1000 reviews\", \"cost\": \"$35\"}"),
            JSONObject("{\"product\": \"Fabuloso aroma lavanda 800 ml\", \"rating\": \"3.5\", \"reviews\": \"100 reviews\", \"cost\": \"$16\"}"),
            JSONObject("{\"product\": \"Regio Rinde Mas 4+2 rollos\", \"rating\": \"5\", \"reviews\": \"800 reviews\", \"cost\": \"$34\"}"),
            JSONObject("{\"product\": \"Paquete 24 Sol Chelada 473 ml\", \"rating\": \"2.5\", \"reviews\": \"300 reviews\", \"cost\": \"$513\"}")
        )
        binding.rvProductEntries.adapter = MainAdapter(fakeProductData)
    }
}