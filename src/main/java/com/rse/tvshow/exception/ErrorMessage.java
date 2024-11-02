package com.rse.tvshow.exception;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {
    private int statusCode;
    private String message;
    private LocalDateTime timestamp;

    public ErrorMessage(int statusCode, String message) {
        this(statusCode, message, LocalDateTime.now());
    }


}
