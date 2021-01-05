package com.couchplanner.user.messages;

public enum ErrorMessage {


    USER_NOT_FOUND("User was not found", "USER_NOT_FOUND"),
    USER_ALREADY_EXISTS("User already exists", "USER_ALREADY_EXISTS");


    private final String message;
    private final String code;

    ErrorMessage(String message, String errorCode) {
        this.message = message;
        this.code = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }
}


