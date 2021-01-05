package com.couchplanner.user.messages;

public enum SuccessMessage {

    USER_REGISTERED_SUCCESS("User was registered", "USER_REGISTERED_SUCCESS");

    private final String message;
    private final String code;

    SuccessMessage(String message, String errorCode) {
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
