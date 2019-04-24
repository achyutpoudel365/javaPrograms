package com.nabin.easynotes.resource;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Builder
public class UserResource {

    private String userName;

    private String status;

    private Date createdDate;
}
