package com.nabin.easynotes.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Builder
public class NoteResource {

    private String title;

    private String content;

    private Long noteId;

    @JsonProperty(value = "created_date")
    private Date createdDate;

    private String createdByName;

}
