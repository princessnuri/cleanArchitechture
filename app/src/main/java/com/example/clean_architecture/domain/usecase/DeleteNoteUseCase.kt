package com.example.clean_architecture.domain.usecase

import com.example.clean_architecture.domain.model.Note
import com.example.clean_architecture.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(private val noteRepository: NoteRepository){

    operator fun invoke(note: Note)= noteRepository.deleteNote(note)

}