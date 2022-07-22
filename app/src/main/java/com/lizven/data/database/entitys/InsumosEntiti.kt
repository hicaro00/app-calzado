package com.lizven.data.database.entitys

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "insumos")
data class InsumosEntiti (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id:Int = -1,
    @ColumnInfo(name = "description")val description: String,
    @ColumnInfo(name = "categoriaInsumo")val categoryInsumo: String,
    @ColumnInfo(name = "precioBruto")val precioSinIgv: Number,
    @ColumnInfo(name = "seriado")val seriado: Boolean,
    @ColumnInfo(name = "cantidad")val cantidad: Number,
    @ColumnInfo(name = "unidadDmedida")val unidadMedida: String,
    @ColumnInfo(name = "paresXnumero")val paresXnumero: List<String>,
    @ColumnInfo(name = "numeroXserie")val NumerosXserie: List<String>
        )


