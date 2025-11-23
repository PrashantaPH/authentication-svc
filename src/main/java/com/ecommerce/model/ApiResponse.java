package com.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonPropertyOrder({"api_status", "api_version", "error_code", "message", "data"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {

    @JsonProperty("api_status")
    private String apiStatus;
    @JsonProperty("api_version")
    private String apiVersion;
    @JsonProperty("error_code")
    private String errorCode;
    private String message;
    private T data;
}
