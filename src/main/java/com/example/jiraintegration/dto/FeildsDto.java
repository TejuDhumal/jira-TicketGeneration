package com.example.jiraintegration.dto;

public class FeildsDto {
    public ProjectDto project;
    public String summary;
    public String description;
    public IssueTypeDto issuetype;

    public FeildsDto() {
    }

    public ProjectDto getProject() {
        return project;
    }

    public void setProject(ProjectDto project) {
        this.project = project;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IssueTypeDto getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(IssueTypeDto issuetype) {
        this.issuetype = issuetype;
    }

    public FeildsDto(ProjectDto project, String summary, String description, IssueTypeDto issuetype) {
        this.project = project;
        this.summary = summary;
        this.description = description;
        this.issuetype = issuetype;
    }
}
