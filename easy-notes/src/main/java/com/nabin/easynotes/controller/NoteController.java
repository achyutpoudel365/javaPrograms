package com.nabin.easynotes.controller;

import com.nabin.easynotes.exception.ResourceNotFoundException;
import com.nabin.easynotes.model.Note;
import com.nabin.easynotes.repository.NoteRepository;
import com.nabin.easynotes.request.NoteRequest;
import com.nabin.easynotes.resource.NoteResource;
import com.nabin.easynotes.service.NoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private NoteService noteService;

    //Get all notes...
    @GetMapping("/notes")
    public List<Note> getAllNotes() {
        return noteRepository.findAll(new Sort(Sort.Direction.ASC, "title"));
    }

    @PostMapping("/notes")
    public NoteResource createNote(@Valid @RequestBody NoteRequest note){
        return noteService.addNewNote(note);
    }

    @GetMapping("/notes/{id}")
    public Note getNoteById(@PathVariable(value = "id") Long noteId){
        return noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note","id",noteId));

    }

    @PutMapping("/notes/{id}")
    public Note updateNote(@PathVariable(value = "id")Long noteId,
                           @Valid @RequestBody Note noteDetails){

        Note note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note","id",noteId));
        note.setTitle(noteDetails.getTitle());
        note.setContent(noteDetails.getContent());

        Note updateNote = noteRepository.save(note);
        return updateNote;
    }

    @DeleteMapping("/notes/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id")Long noteId){

        Note note = noteRepository.findById(noteId)
                .orElseThrow(()-> new ResourceNotFoundException("Note","id",noteId));
        noteRepository.delete(note);
        return ResponseEntity.ok().build();
    }


    @GetMapping("notes/{title}/title")
    public NoteResource findByTitle(@PathVariable(value = "title") String title) {
        return noteService.findByTitle(title);
    }


}
