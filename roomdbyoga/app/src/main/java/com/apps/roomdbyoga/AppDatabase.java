package com.apps.roomdbyoga;

//Tanggal Pengerjaan : 30-4-2020
//Deskripsi Pengerjaan : Mengerjakan semua kelas
//NIM : 10117151
//Nama :prayoga mps
//Kelas :IF4
import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {AktivisEntity.class}, version = 1,  exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {


    public abstract AktivisDao aktivisDao();

}
