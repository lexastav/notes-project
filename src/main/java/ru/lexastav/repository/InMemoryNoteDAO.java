package ru.lexastav.repository;

import org.springframework.stereotype.Repository;
import ru.lexastav.model.Note;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryNoteDAO {
    private final List<Note> NOTES = new ArrayList<>();

    public List<Note> findAllNote() { return NOTES; }
    public Note saveNote(Note note) {
        note.setDateAdd(new Date());
        NOTES.add(note);
        return note;
    }
    public Note findByTitle(String title) {
        return NOTES.stream()
                .filter(element -> element.getTitle().equals(title)).findFirst().orElse(null);
    }
    public Note updateNote(Note note) {
        var noteIndex = IntStream.range(0, NOTES.size())
                .filter(index -> NOTES.get(index).getTitle().equals(note.getTitle())).findFirst().orElse(-1);
        if (noteIndex > -1) {
            note.setDateAdd(new Date());
            NOTES.set(noteIndex, note);
            return note;
        }
        return null;
    }
    public void deleteNote(String title) {
        var note = findByTitle(title);
        if (note != null) {
            NOTES.remove(note);
        }

    }

}
