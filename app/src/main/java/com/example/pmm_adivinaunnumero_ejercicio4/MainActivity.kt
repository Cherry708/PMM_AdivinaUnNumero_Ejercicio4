package com.example.pmm_adivinaunnumero_ejercicio4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_adivinaunnumero_ejercicio4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rango = (1..100)

        var numeroAleatorio = (rango).random()

        binding.btnNuevoJuego.setOnClickListener {
            numeroAleatorio = (rango).random()
        }

        binding.btnComprobar.setOnClickListener {
            val entrada = binding.etEntrada.text.toString().toInt()
            when{
                entrada < numeroAleatorio -> binding.tvResultado.text = getString(R.string.valorMenor)
                entrada > numeroAleatorio -> binding.tvResultado.text = getString(R.string.valorMayor)
                entrada == numeroAleatorio -> binding.tvResultado.text = getString(R.string.victoria)
            }
        }
    }
}