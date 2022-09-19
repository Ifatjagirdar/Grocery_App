package com.example.groceryapp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [GroceryItems::class], version = 1)
//Extending Abstract class with RoomDatabase
abstract class GroceryDatabase : RoomDatabase() {

    //CREATING FUNCTION getGroceryDao and Method GroceryDao
    abstract fun getGroceryDao(): GroceryDao

    //CREATING OBJECT AND INSIDE THAT CREATING AN INSTANCE NAMED A VOLATILE.ALSO CREATING VARIABLES FOR OUR INSTANCE
    companion object {
        @Volatile
        private var instance: GroceryDatabase? = null
        private val LOCK = Any()

        //CREATING FUNCTION AS INVOKE
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            //INITIALIZING INSTANCES.ALSO CALLING METHOD CREATEDATABASE
            instance ?: createDatabase(context).also {
              ///INITIALISING INSTANCE AS IT
                instance = it
            }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext, GroceryDatabase::class.java, "GroceryDatabase.db").build()
    }
}