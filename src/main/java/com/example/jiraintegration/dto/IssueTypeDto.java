package com.example.jiraintegration.dto;

public class IssueTypeDto {
    private String id;

    public IssueTypeDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IssueTypeDto(String id) {
        this.id = id;
    }
}
