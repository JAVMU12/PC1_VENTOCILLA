package com.example.pc1_ventocilla

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class JugadorAdapter(private val jugadores: List<Jugador>) : RecyclerView.Adapter<JugadorAdapter.JugadorViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JugadorViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_jugador, parent, false)
        return JugadorViewHolder(view)
    }

    override fun onBindViewHolder(holder: JugadorViewHolder, position: Int) {
        val jugador = jugadores[position]
        holder.nombreTextView.text = jugador.nombre
        holder.anioNacimientoTextView.text = "Año de Nacimiento: ${jugador.edad}"
        holder.edadTextView.text = "Edad: ${jugador.edad}"
        holder.imagenImageView.setImageResource(jugador.imagenResId)
    }

    override fun getItemCount(): Int = jugadores.size

    class JugadorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombreTextView: TextView = itemView.findViewById(R.id.nombreTextView)
        val anioNacimientoTextView: TextView = itemView.findViewById(R.id.anioNacimientoTextView)
        val edadTextView: TextView = itemView.findViewById(R.id.edadTextView)
        val imagenImageView: ImageView = itemView.findViewById(R.id.imagenImageView)
    }
}