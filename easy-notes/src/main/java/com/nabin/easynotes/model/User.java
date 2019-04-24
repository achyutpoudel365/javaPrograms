package com.nabin.easynotes.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "user")
@ToString
@Setter
@Getter
public class User extends AbstractEntity implements Serializable {

    @NotBlank
    private String name;

    @NotBlank
    private String password;

    private UserStatus status;


}



