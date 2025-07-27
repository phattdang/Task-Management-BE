package phatdang.se.taskapi.exception;

import lombok.Getter;

@Getter

public enum HttpCodes {
    OK(200, "Successfully");

    final Integer CODE;
    final String MESSAGE;

    HttpCodes(Integer code, String message) {
        this.CODE = code;
        this.MESSAGE = message;
    }
}
