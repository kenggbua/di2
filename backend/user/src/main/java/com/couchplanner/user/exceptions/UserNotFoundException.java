package com.couchplanner.user.exceptions;

import com.couchplanner.user.messages.ErrorMessage;


public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super(ErrorMessage.USER_NOT_FOUND.getMessage());
    }
}


