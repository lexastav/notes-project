package ru.lexastav.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.lexastav.model.Note;
import ru.lexastav.repository.InMemoryNoteDAO;
import ru.lexastav.service.NoteService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryNoteServiceImpl implements NoteService {

    private final InMemoryNoteDAO repository;

    @Override
    public List<Note> findAllNote(){ return repository.findAllNote(); }

    @Override
    public Note saveNote(Note note) { return repository.saveNote(note);}

    @Override
    public Note findByTitle(String title) { return repository.findByTitle(title); }

    @Override
    public Note updateNote(Note note) { return repository.updateNote(note); }

    @Override
    public void deleteNote(String title) {
        repository.deleteNote(title);

    }

}
