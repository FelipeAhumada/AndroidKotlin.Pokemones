package com.example.apppokemon

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apppokemon.databinding.ItemPokemonListBinding

class PokemonViewHolder(view:View):RecyclerView.ViewHolder(view) {
    val binding = ItemPokemonListBinding.bind(view)

    val name = view.findViewById<TextView>(R.id.tvName)

    fun render(pokemonModel: ClsPokemon){
        binding.tvName.text = pokemonModel.name
        binding.tvType.text = pokemonModel.type
        binding.tvBaseExperience.text = pokemonModel.base_experience.toString()
        //Nos carga la ruta de la imagen
        Glide.with(binding.ivAvatar.context).load(pokemonModel.avatar).into(binding.ivAvatar)
        //Click foto
        binding.ivAvatar.setOnClickListener{ Toast.makeText(binding.ivAvatar.context, pokemonModel.name, Toast.LENGTH_SHORT).show()}
        //Click en la lista.
        itemView.setOnClickListener{
            Toast.makeText(binding.ivAvatar.context, pokemonModel.name, Toast.LENGTH_SHORT).show()
        }
    }
}