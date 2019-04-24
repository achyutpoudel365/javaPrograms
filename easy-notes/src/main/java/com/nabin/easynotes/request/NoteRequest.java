package com.nabin.easynotes.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NoteRequest {
    private String title;

    private String content;

    private Long userId;
}
