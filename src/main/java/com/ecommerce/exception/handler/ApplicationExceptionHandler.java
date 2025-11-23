package com.ecommerce.exception.handler;

import com.ecommerce.exception.InvalidAuthException;
import com.ecommerce.model.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.ecommerce.utils.Utility.errorResponse;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler({InvalidAuthException.class})
    public ResponseEntity<ApiResponse<Object>> invalidAuthException(HttpServletRequest req, InvalidAuthException ex) {
        ApiResponse<Object> apiResponse = errorResponse(ex.getErrorCode(), ex.getMessage());
        return new ResponseEntity<>(apiResponse, HttpStatus.UNAUTHORIZED);
    }
}
