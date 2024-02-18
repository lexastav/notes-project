package ru.lexastav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lexastav.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
    void deleteByTitle(String title);

    Note findNoteByTitle(String title);
}
