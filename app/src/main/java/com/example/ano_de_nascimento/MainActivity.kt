package com.example.ano_de_nascimento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ano_de_nascimento.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListener()

    }

    private fun setListener() {
        binding.calcularBTN.setOnClickListener{
            val idade = binding.idadeIdade.text.toString().toInt()
            val calculoAno = (2021 - idade)

            if(idade in 1..100){
                binding.resultadoTXT.setText("Você nasceu em: ${calculoAno}") }

            else {Toast.makeText(baseContext, "Escolha um valor entre 1 e 100", Toast.LENGTH_SHORT).show() }


        }


    }

}