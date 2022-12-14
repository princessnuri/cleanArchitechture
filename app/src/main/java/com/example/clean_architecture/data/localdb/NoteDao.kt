package com.example.clean_architecture.data.localdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.clean_architecture.data.model.NoteEntity

@Dao
interface NoteDao {
    //crud create read update delete

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun createNote (noteEntity: NoteEntity)

    @Query("SELECT * FROM notes")
    suspend fun getAllNotes():List<NoteEntity>

    @Update
    suspend fun editNote(noteEntity: NoteEntity)

    @Delete
    suspend fun deleteNote(noteEntity: NoteEntity)
}