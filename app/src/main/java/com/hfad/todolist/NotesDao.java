package com.hfad.todolist;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

// Dao - data access object
@Dao
public interface NotesDao {

    @Query("SELECT * FROM notes")
    List<Note> getNotes();

    @Insert
    void add(Note note);

    @Query("DELETE FROM notes WHERE id = :id")
    void remove(int id);
}
