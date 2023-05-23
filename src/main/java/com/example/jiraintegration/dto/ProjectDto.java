package com.example.jiraintegration.dto;

public class ProjectDto {
    private String key;

    public ProjectDto(String key) {
        this.key = key;
    }

    public ProjectDto() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
