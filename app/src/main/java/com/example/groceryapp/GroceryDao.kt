package com.example.groceryapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Delete
import androidx.room.Query
import androidx.room.OnConflictStrategy


@Dao
interface GroceryDao {

    // Insert function is used to
    // insert data in database.
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: GroceryItems)

    // Delete function is used to
    // delete data in database.
    @Delete
    suspend fun delete(item: GroceryItems)

    // getAllGroceryItems function is used to get
    // all the data of database.
    @Query("SELECT * FROM grocerry_items")
    fun getAllGroceryItems():LiveData<List<GroceryItems>>
}