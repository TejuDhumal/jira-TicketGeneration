package com.example.jiraintegration.model;

import com.example.jiraintegration.dto.FeildsDto;
import com.example.jiraintegration.dto.IssueTypeDto;
import com.example.jiraintegration.dto.ProjectDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class TicketPayload {

    @NotNull(message = "fields not be blank")
    private FeildsDto fields;

    public TicketPayload() {
    }

    public FeildsDto getFields() {
        return fields;
    }

    public void setFields(FeildsDto fields) {
        this.fields = fields;
    }

    public TicketPayload(FeildsDto fields) {
        this.fields = fields;
    }
}
