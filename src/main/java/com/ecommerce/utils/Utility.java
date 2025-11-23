package com.ecommerce.utils;

import com.ecommerce.model.ApiResponse;

import java.util.Map;

import static com.ecommerce.utils.Constants.*;

public class Utility {

    private Utility() {
    }

    public static ApiResponse<Object> errorResponse(String errorCode, String message) {
        return ApiResponse.builder()
                .apiStatus(FAILURE)
                .apiVersion("1.0")
                .errorCode(errorCode)
                .message(message)
                .build();
    }

    public static ApiResponse<Object> errorResponse(String errorCode, String message, Map<String, Object> errorDetails) {
        return ApiResponse.builder()
                .apiStatus(FAILURE)
                .apiVersion("1.0")
                .errorCode(errorCode)
                .message(message)
                .data(errorDetails)
                .build();
    }


}
