package ru.lexastav.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.lexastav.model.Note;
import ru.lexastav.service.NoteService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notes")
@AllArgsConstructor
public class NoteController {

    private final NoteService service;
    @GetMapping
    public List<Note> findAllNote(){
        //todo
        return service.findAllNote();
    }


    @PostMapping("save_note")
    public String saveNote(@RequestBody Note note) {
        service.saveNote(note);
        return "Note successfully saved!"; }

    @GetMapping("/{title}")
    public Note findByTitle(@PathVariable String title) { return service.findByTitle(title); }

    @PutMapping("update_note")
    public Note updateNote(@RequestBody Note note) { return service.updateNote(note); }

    @DeleteMapping("delete_note/{title}")
    public void deleteNote(@PathVariable String title) {
        service.deleteNote(title);
    }


}
