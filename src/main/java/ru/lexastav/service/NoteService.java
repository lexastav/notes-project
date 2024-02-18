package ru.lexastav.service;

import ru.lexastav.model.Note;

import java.util.List;


public interface NoteService {
    List<Note> findAllNote();
    Note saveNote(Note note);
    Note findByTitle(String title);
    Note updateNote(Note note);

    void deleteNote(String title);



}
