package com.ecommerce.model;

public class ErrorCodes {

    // Authentication Errors
    public static final String UNAUTHORIZED_ACCESS = "AUTH_000";
    public static final String INVALID_CREDENTIALS = "AUTH_001";
    public static final String INSUFFICIENT_AUTHENTICATION = "AUTH_002";
    public static final String ACCOUNT_DISABLED = "AUTH_003";
    public static final String ACCOUNT_LOCKED = "AUTH_004";
    public static final String ACCOUNT_EXPIRED = "AUTH_005";
    public static final String CREDENTIALS_EXPIRED = "AUTH_006";
    public static final String INVALID_JWT_TOKEN = "AUTH_007";
    public static final String INVALID_BEARER_TOKEN = "AUTH_008";
    public static final String ACCESS_DENIED = "AUTH_009";

    // Validation Errors
    public static final String VALIDATION_ERROR = "VALIDATION_001";

    // Business Logic Errors
    public static final String USER_NOT_FOUND = "USER_001";
    public static final String PRODUCT_NOT_FOUND = "PRODUCT_001";
    public static final String ORDER_NOT_FOUND = "ORDER_001";

    // System Errors
    public static final String INTERNAL_SERVER_ERROR = "SYS_001";
    public static final String SERVICE_UNAVAILABLE = "SYS_002";
}
