package com.example.apppokemon

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

//Cuando no les reconsca la Clase pokemonAdapter, basta con posicionarse arriba y click en implementar
//metodos seleccionan todos y les crea el codigo en forma automatica
class PokemonAdapter(private val pokemonList: List<ClsPokemon>):RecyclerView.Adapter<PokemonViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        //Este es la vista que se debe enviar por un objeto LayoutInlfater
        val layoutInflater = LayoutInflater.from(parent.context)
        return PokemonViewHolder(layoutInflater.inflate(R.layout.item_pokemon_list, parent, false))
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val item = pokemonList[position]
        holder.render(item)
    }
    //Retorno el valor completo del listado, si lo dehjo estatico se cae.
    //utilizo una forma de acortar codigo con kotlin ya que es padrisimo monkeys. Ademas optimozamos codigo
    override fun getItemCount(): Int = pokemonList.size
    //Forma aburrida, pero valida.
    //override fun getItemCount(): Int {
    //    return pokemonList.size
    //}

}