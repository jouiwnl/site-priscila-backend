package com.joaoh.site.priscila.controllers.exceptions;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StandardError implements Serializable {
    private Long timestamp;
    private Integer Status;
    private String error;
    private String message;
    private String path;

    public StandardError(Long timestamp, Integer status, String error, String message, String path) {
        this.timestamp = timestamp;
        Status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    @Override
    public String toString() {
        return "{" +
                " timestamp='" + getTimestamp() + "'" +
                ", Status='" + getStatus() + "'" +
                ", error='" + getError() + "'" +
                ", message='" + getMessage() + "'" +
                ", path='" + getPath() + "'" +
                "}";
    }
}    