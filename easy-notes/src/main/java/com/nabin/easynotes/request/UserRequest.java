package com.nabin.easynotes.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
public class UserRequest {

    private String userName;

    @Override
    public String toString() {
        return "New username ::"+this.userName;
    }
}
