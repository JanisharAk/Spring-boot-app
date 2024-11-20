package com.example.Spring_boot_app.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RestServiceResponse {
    private boolean error;
    private String code;
    private String errorMessage;
    private String message;
    private List<Object> data;
    private List<String> errorList;

    public RestServiceResponse() {

    }
    public RestServiceResponse(final boolean error,final String code, final String errorMessage,
                               final String message) {
        this.error = error;
        this.code = code;
        this.message = message;

    }
}
