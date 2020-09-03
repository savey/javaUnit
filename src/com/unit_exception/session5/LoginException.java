package com.unit_exception.session5;

public class LoginException extends RuntimeException {

    final static int ERROR_CODE_1 = 1001;
    final static int ERROR_CODE_2 = 1002;
    final static int ERROR_CODE_3 = 1003;
    final static int ERROR_CODE_4 = 1004;

    private Integer errorCode;

    public LoginException(Integer code, String message) {
        super(message);
        this.errorCode = code;
    }
}
