package com.nabin.easynotes.service;

import com.nabin.easynotes.converter.NoteConverter;
import com.nabin.easynotes.exception.ResourceNotFoundException;
import com.nabin.easynotes.model.Note;
import com.nabin.easynotes.model.User;
import com.nabin.easynotes.repository.NoteRepository;
import com.nabin.easynotes.repository.UserRepository;
import com.nabin.easynotes.request.NoteRequest;
import com.nabin.easynotes.resource.NoteResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.persistence.Id;

@Service
@Slf4j
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private NoteConverter noteConverter;

    @Override
    public NoteResource findByTitle(String title) {
        log.info("Finding note by title :: {}", title);
        return convertNoteToNoteResource(noteRepository.findByTitle(title), title);
    }

    @Override
    public NoteResource addNewNote(NoteRequest noteRequest) {
        User user = userRepository.findActiveUser(noteRequest.getUserId());
        if (user == null) {
            throw new ResourceNotFoundException("User", "id", noteRequest.getUserId());
        }
        Note note = new Note();
        note.setContent(noteRequest.getContent());
        note.setTitle(noteRequest.getTitle());
        note.setUser(user);
        return noteConverter.convertNote(noteRepository.save(note));
    }

    private NoteResource convertNoteToNoteResource(Note note,
                                                   String title) {
        if (note == null) {
            throw new ResourceNotFoundException("Note", "Title", title);
        }
        log.info("Found note is :: {}", note.toString());
        return NoteResource.builder()
                .content(note.getContent())
                .createdDate(note.getCreatedAt())
                //.id(note.getId())
                .title(note.getTitle())
                .build();
    }


}
