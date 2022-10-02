package com.example.mydentist;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Teeth.class}, version = 1)
public abstract class TeethDatabase extends RoomDatabase {
    public abstract TeethDao teethDao();
}
