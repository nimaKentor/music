package com.eurobaluchi.music.rest.exception;

import lombok.Data;

@Data
public class ExceptionResponse {
    private String errorCode;
    private String errorMessage;
}
