package com.example.apppokemon

class PokemonProvider {
    //Objecto accesible a los datos
    companion object{
        val pokemonesList = listOf<ClsPokemon>(
        ClsPokemon(1,"bulbasaur", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png",64, "grass" ),
        ClsPokemon(2,"ivysaur", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/2.png", 142, "grass"),
        ClsPokemon(3,"venusaur", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/3.png", 263,  "grass"),
        ClsPokemon(4,"Charmander", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png", 62,  "fire"),
        ClsPokemon(5,"charmeleon", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/5.png", 142,  "fire" ),
        ClsPokemon(6,"charizard", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png", 267,  "fire" ),
        ClsPokemon(7,"squirtle", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png", 63,  "water" ),
        ClsPokemon(8,"wartortle", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/8.png", 142 , "water" ),
        ClsPokemon(9,"blastoise", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/9.png", 265 , "water" ),
        ClsPokemon(10,"caterpie","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/10.png", 39 , "bug" ),
        ClsPokemon(11,"metapod","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/11.png" ,72, "bug" ),
        ClsPokemon(12,"butterfree", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/12.png" ,198, "bug"  ),
        ClsPokemon(13,"weedle", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/13.png" ,39, "bug"   ),
        ClsPokemon(14,"kakuna", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/14.png" ,72, "bug" ),
        ClsPokemon(15,"sniper","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/15.png" ,178, "bug" ),
        ClsPokemon(16,"pidgey", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/16.png", 50, "normal" ),
        ClsPokemon(17,"pidgeotto","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/17.png", 50, "normal" ),
        ClsPokemon(18,"pidgeot","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/18.png", 50, "normal" ),
        ClsPokemon(19,"rattata", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/19.png" , 51, "normal"),
        ClsPokemon(20,"raticate", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/20.png" , 51, "normal")
        )
    }
}