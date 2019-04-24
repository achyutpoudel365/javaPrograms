package com.nabin.easynotes.converter;

import com.nabin.easynotes.model.Note;
import com.nabin.easynotes.resource.NoteResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NoteConverterImpl implements NoteConverter {
    @Override
    public NoteResource convertNote(Note savedNote) {
        log.info("converting note ..");
        return NoteResource.builder()
                .title(savedNote.getTitle())
                .createdDate(savedNote.getCreatedAt())
                .content(savedNote.getContent())
                .createdByName(savedNote.getUser().getName())
                .noteId(savedNote.getId())
                .build();
    }
}
