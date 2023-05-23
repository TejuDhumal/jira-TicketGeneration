package com.example.jiraintegration.service;

import com.example.jiraintegration.model.TicketPayload;

import java.nio.charset.Charset;
import java.util.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TicketService {
    RestTemplate restTemplate = new RestTemplate();
//    restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

    @Value("${jira.user-name}")
    private String username;
    @Value("${jira.secret}")
    private String secret;
    @Value("${jira.base-url}")
    private String baseUrl;
    @Value("${jira.ticket-url}")
    private String ticketCreationUrl;

    public Object createTicket(TicketPayload ticketPayload) {
            System.out.println(baseUrl.concat(ticketCreationUrl));
        HttpEntity<TicketPayload> entity = new HttpEntity<>(ticketPayload,getHeaders());
            ResponseEntity<Object> response = restTemplate.exchange(
                    "https://iaurosystems.atlassian.net/rest/api/2/issue",
                    HttpMethod.POST,
                    entity,
                    new ParameterizedTypeReference<Object>() {},
                    String.class);
        System.out.println(response.getBody());
            if (response != null) {

                return response.getBody();
            }
            throw new RuntimeException(" ");
        }

    public HttpHeaders getHeaders() {
        String auth = username + ":" + secret;
        String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes());
        String authHeader = "Basic " + encodedAuth;
//        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", authHeader);
        headers.setContentType(MediaType.APPLICATION_JSON);
        System.out.println(headers);
        return headers;
    }
    }

