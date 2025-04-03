package com.example.myapplication;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Muzyka.class}, version = 1,exportSchema = false)
public abstract class BazaDanychPiosenek extends RoomDatabase {
public abstract DaoMuzyka getDaoMuzyka();
}
