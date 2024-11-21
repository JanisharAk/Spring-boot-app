package com.example.Spring_boot_app.controller;

import com.example.Spring_boot_app.dto.RestServiceResponse;

import java.util.List;

public class BaseController {
    protected RestServiceResponse getSuccessResponse(final String message,final List<Object> data) {
        final RestServiceResponse restServiceResponse = new RestServiceResponse(
                false,          // No error
                "200",          // HTTP status code for success
                null,           // No error message
                message         // Success message
        );        restServiceResponse.setData(data);
        return restServiceResponse;
    }
    protected RestServiceResponse getSuccessResponse(final List<Object> data) {
        return getSuccessResponse(null, data);
    }
    protected RestServiceResponse getSuccessResponse(final String message) {
        return getSuccessResponse(message, null);
    }
}
