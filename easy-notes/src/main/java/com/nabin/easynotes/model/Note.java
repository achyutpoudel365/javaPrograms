package com.nabin.easynotes.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;


@Setter
@Getter
@Entity
@Table(name = "notes")
@ToString
public class Note extends AbstractEntity implements Serializable {

    @NotBlank
    private String title;

    @NotBlank
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
