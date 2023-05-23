package com.example.jiraintegration.dto;

import com.example.jiraintegration.model.TicketPayload;

public class Event {
    private int StatusCode;
    private String message;
    private Object result;

    public Event() {
    }


    public int getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(int statusCode) {
        StatusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Event(int statusCode, String message, Object result) {
        StatusCode = statusCode;
        this.message = message;
        this.result = result;
    }
}
