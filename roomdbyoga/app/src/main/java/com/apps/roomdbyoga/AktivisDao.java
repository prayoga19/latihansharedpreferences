package com.apps.roomdbyoga;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

//Tanggal Pengerjaan : 30-4-2020
//Deskripsi Pengerjaan : Mengerjakan semua kelas
//NIM : 10117151
//Nama :prayoga mps
//Kelas :IF4

@Dao
public interface AktivisDao {

    @Insert
    void tambahAktivis(AktivisEntity aktivisEntity);

    @Delete
    public void hapusAktivis(AktivisEntity aktivisEntity);

    @Query("SELECT * FROM AktivisEntity")
    List<AktivisEntity> tampilSeluruhAktivis();

    @Query("SELECT * FROM AktivisEntity WHERE zonaTugas LIKE :zona")
    List<AktivisEntity> findByZone(String zona);

}
