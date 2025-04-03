package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.text.Normalizer;
import java.util.List;

@Dao
public interface DaoMuzyka {
@Insert
public void dodajPiosenke (Muzyka muzyka);
@Insert
public void dodajWielePiosenke(Muzyka ...muzyka);
@Delete
public void usunPiosenke(Muzyka muzyka);
@Update
public void zaktualizujPiosenki(Muzyka muzyka);
@Query("Select * From 'Piosenki'")
public List<Muzyka>wypiszWszystkiePiosenki();
@Query("Select * From Piosenki Where rok_wydania <2000")
public List<Muzyka>wypiszPiosenkiZ20Wieku();
@Query("Select * From Piosenki Where tytul Like 't%'")
public List<Muzyka>wypiszPiosenkiZaczynajaceSieNaT();
}
