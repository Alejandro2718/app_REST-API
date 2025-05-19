package com.example.app_rest_api.shared.api.response;
//By Alejandro Jimenez
public class ErrorMessageResponse {

    private final String message;

    public ErrorMessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
