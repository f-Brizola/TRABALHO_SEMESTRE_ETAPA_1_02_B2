package br.unipar.trabalho_semestre_etapa_1_02_b2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainTela3 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_3)

        val btnT3VoltarT1 = findViewById<Button>(R.id.btnT3VoltarT1)
        val btnT3VoltarT2 = findViewById<Button>(R.id.btnT3VoltarT2)

        // Botao que volta pra tela 1 = MainActivity
        btnT3VoltarT1.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Botao que vai pra tela 2 = MainTela2
        btnT3VoltarT2.setOnClickListener {

            val intent = Intent(this, MainTela2::class.java)
            startActivity(intent)
        }

    }
}