package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private BazaDanychPiosenek bazaDanychPiosenek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RoomDatabase.Callback callback=new RoomDatabase.Callback() {
            @Override
            public void onCreate(@NonNull SupportSQLiteDatabase db) {
                super.onCreate(db);
            }

            @Override
            public void onOpen(@NonNull SupportSQLiteDatabase db) {
                super.onOpen(db);
            }
        };
        bazaDanychPiosenek= Room.databaseBuilder(getApplicationContext(), BazaDanychPiosenek.class,"Piosenki")
                .addCallback(callback)
                .allowMainThreadQueries()
                .build();
        WypiszPiosenki();
    }
    private void WypiszPiosenki(){
        bazaDanychPiosenek.getDaoMuzyka().dodajPiosenke(new Muzyka("fwfwf","fwafafaf",2000,0));
    }
}