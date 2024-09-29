package com.example.pc1_ventocilla

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado)

        // Lista de jugadores con imágenes y datos
        val jugadores = listOf(
            Jugador("Lionel Messi", 1987, R.drawable.messi),
            Jugador("Cristiano Ronaldo", 1985, R.drawable.cristiano),
            Jugador("Neymar Jr.", 1992, R.drawable.neymar)
        )

        // Configurar el RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = JugadorAdapter(jugadores)

        // Botón para volver al login
        val returnButton = findViewById<Button>(R.id.returnButton)
        returnButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}