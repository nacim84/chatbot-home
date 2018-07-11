package com.chatbot.home.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

/**
 * Created by admnrabi on 10/07/2018.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(NON_EMPTY)
public class QueryDto {

    private String responseId ;

    @JsonProperty("queryResult")
    private QueryResultDto queryResultDto;

    @JsonProperty("originalDetectIntentRequest")
    private OriginalDetectIntentRequestDto originalDetectIntentRequestDto;

    private String session;

    public QueryDto() {
    }

    public QueryResultDto getQueryResultDto() {
        return queryResultDto;
    }

    public void setQueryResultDto(QueryResultDto queryResultDto) {
        this.queryResultDto = queryResultDto;
    }

    public OriginalDetectIntentRequestDto getOriginalDetectIntentRequestDto() {
        return originalDetectIntentRequestDto;
    }

    public void setOriginalDetectIntentRequestDto(OriginalDetectIntentRequestDto originalDetectIntentRequestDto) {
        this.originalDetectIntentRequestDto = originalDetectIntentRequestDto;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "QueryDto{" +
                "responseId='" + responseId + '\'' +
                ", queryResultDto=" + queryResultDto +
                ", originalDetectIntentRequestDto=" + originalDetectIntentRequestDto +
                ", session='" + session + '\'' +
                '}';
    }
}
