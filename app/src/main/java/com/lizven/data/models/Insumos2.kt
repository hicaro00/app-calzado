package com.lizven.data.models

data class Insumos(

    val id: String,
    val descrition: String,
    val categoryInsumo: String,
    val precioSinIgv: Number,
    val seriado: Boolean,
    val cantidad: Number,
    val unidadMedida: String,
    val paresXnumero: List<String>,
    val NumerosXserie: List<String>

)