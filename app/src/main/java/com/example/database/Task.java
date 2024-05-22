package com.example.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Task {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = "title")
    String title;
    String time;
    String desc;
    boolean status;

    public Task(String title, String time, String desc, boolean status) {
        this.title = title;
        this.time = time;
        this.desc = desc;
        this.status = status;
    }
}
