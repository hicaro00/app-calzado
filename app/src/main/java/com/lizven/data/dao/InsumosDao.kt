package com.lizven.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.lizven.data.database.entitys.InsumosEntiti

@Dao
interface InsumosDao {

    @Query("SELECT * FROM insumos")
    suspend fun getallinsumos():List<InsumosEntiti>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertall(insumos:List<InsumosEntiti>)

}