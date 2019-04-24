package com.nabin.easynotes.service;

import com.nabin.easynotes.model.Note;
import com.nabin.easynotes.request.NoteRequest;
import com.nabin.easynotes.resource.NoteResource;

public interface NoteService {
    NoteResource findByTitle(String title);

    NoteResource addNewNote(NoteRequest note);
}
