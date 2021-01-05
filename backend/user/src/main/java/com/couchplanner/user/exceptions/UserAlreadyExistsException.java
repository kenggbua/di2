package com.couchplanner.user.exceptions;

import com.couchplanner.user.messages.ErrorMessage;

public class UserAlreadyExistsException extends RuntimeException{

    public UserAlreadyExistsException() {
        super(ErrorMessage.USER_ALREADY_EXISTS.getMessage());
    }
}
