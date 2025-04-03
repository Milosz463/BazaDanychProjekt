package com.example.myapplication;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Insert;
import androidx.room.PrimaryKey;

@Entity (tableName = "Piosenki")
public class Muzyka {
    @PrimaryKey (autoGenerate = true)
    @ColumnInfo(name = "id_Piosenki")
    int id;
    String wykonawca;
    String tytul;
    int rok_wydania;
    int polubienia;
    @Ignore
    public Muzyka(){

    }
    public Muzyka(String wykonawca, String tytul, int rok_wydania, int polubienia) {
        this.id=0;
        this.wykonawca = wykonawca;
        this.tytul = tytul;
        this.rok_wydania = rok_wydania;
        this.polubienia = polubienia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWykonawca() {
        return wykonawca;
    }

    public void setWykonawca(String wykonawca) {
        this.wykonawca = wykonawca;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getRok_wydania() {
        return rok_wydania;
    }

    public void setRok_wydania(int rok_wydania) {
        this.rok_wydania = rok_wydania;
    }

    public int getPolubienia() {
        return polubienia;
    }

    public void setPolubienia(int polubienia) {
        this.polubienia = polubienia;
    }
}
