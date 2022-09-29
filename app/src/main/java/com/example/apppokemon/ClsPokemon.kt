package com.example.apppokemon

data class ClsPokemon(
    //val son objetos inmutables
    //var son objetos actualizables
    val id: Number,
    val name:String,
    val avatar: String,
    var base_experience: Number,
    val type: String
    //var height: Number,
    //var is_default: Boolean,
    //var location_area_encounters: String,
    //var order: Number,
    //var past_types: String ,
    //var weight: Number,
    /*val abilities : String,
    var forms: String,
    var game_indices: Number,
    var held_items: String,
    var moves: String,
    val species: String,
    var sprites: String,
    var stats: Number,*/

    //name = Nombre
    //Type = Tipo
    //base_experience = Number
    // Avatar = Foto Url = String
)