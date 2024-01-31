package com.example.proyectoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectoandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val books = listOf<Pelicula>(
            Pelicula(
                "El mar",
                "2023",
                "Alex",
                listOf("Terror", "Aventura")
            ),
            Pelicula(
                "La monja",
                "2020",
                "Pedro",
                listOf("Terror", "Suspense")
            )
        )
    }
}