package project.learning.exception;

public enum ErrorCode {
    Unknown_Exception(1223, "Unknown exception"),
    USERNAME_INVALID(1234, "Username invalid"),
    EMAIL_EXISTED(1001, "Email existed"),
    EMAIL_NOT_EXISTED(1002, "Email not existed"),
    UNAUTHENTICATED(1003, "Unauthenticated");

    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }

}
