package com.nabin.easynotes.converter;

import com.nabin.easynotes.model.Note;
import com.nabin.easynotes.resource.NoteResource;

public interface NoteConverter {
    NoteResource convertNote(Note savedNote);
}
