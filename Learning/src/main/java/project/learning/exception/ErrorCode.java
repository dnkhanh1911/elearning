package project.learning.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
@Getter
public enum ErrorCode {
    Unknown_Exception(1001, "Unknown exception", HttpStatus.INTERNAL_SERVER_ERROR),
    USERNAME_INVALID(1002, "Username invalid", HttpStatus.BAD_REQUEST),
    EMAIL_EXISTED(1003, "Email existed", HttpStatus.BAD_REQUEST),
    EMAIL_NOT_EXISTED(1004, "Email not existed", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(1005, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1006, "You do not have permission", HttpStatus.UNAUTHORIZED),
    ;

    private int code;
    private String message;
    private HttpStatusCode statusCode;

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode =  statusCode;
    }
}
