package com.example.apppokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apppokemon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Activamos binding, revisar el build gradle tambien hice unos cambios despues de hacerlo
        //Solo deben sincronizar
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecycleView()
    }
    //Funcion de inicio de llamada al objeto
  fun initRecycleView(){

        binding.rviewPokemones.layoutManager = LinearLayoutManager(this)
        binding.rviewPokemones.adapter = PokemonAdapter(PokemonProvider.pokemonesList)
  }
}