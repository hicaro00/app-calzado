package com.lizven.data.sqliite

import androidx.room.Database
import com.lizven.data.dao.InsumosDao
import com.lizven.data.database.entitys.InsumosEntiti

@Database(entities = [InsumosEntiti::class], version = 1)
 abstract class InsumosDatabase {

  abstract fun getInsumosDao():InsumosDao
}