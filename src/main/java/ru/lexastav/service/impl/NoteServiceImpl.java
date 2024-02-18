package ru.lexastav.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.lexastav.model.Note;
import ru.lexastav.repository.NoteRepository;
import ru.lexastav.service.NoteService;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class NoteServiceImpl implements NoteService {

    private final NoteRepository repository;
    @Override
    public List<Note> findAllNote() { return repository.findAll(); }
    @Override
    public Note saveNote(Note note) { return repository.save(note); }
    @Override
    public Note findByTitle(String title) { return repository.findNoteByTitle(title); }
    @Override
    public Note updateNote(Note note) { return repository.save(note); }

    @Override
    public void deleteNote(String title) {
        repository.deleteByTitle(title);
    }
}
