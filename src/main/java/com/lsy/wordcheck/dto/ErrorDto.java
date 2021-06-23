package com.lsy.wordcheck.dto;

import java.util.HashMap;
import java.util.Map;

public class ErrorDto {

    private Map<String, String> errors = new HashMap<>();

    public ErrorDto(final Map<String, String> errors) {
        this.errors = errors;
    }

    public ErrorDto(final String message) {
        this.errors.put("message", message);
    }

    public Map<String, String> getErrors() {
        return errors;
    }
}
