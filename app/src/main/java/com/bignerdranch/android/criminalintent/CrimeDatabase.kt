package com.bignerdranch.android.criminalintent

import androidx.room.Database
import androidx.room.TypeConverters
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bignerdranch.android.criminalintent.Crime


@Database(entities = [Crime::class], version=1, exportSchema = true)
@TypeConverters(CrimeTypeConverters::class)

abstract class CrimeDatabase: RoomDatabase() {
    abstract fun crimeDao(): CrimeDao
}