package com.chatbot.home.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

/**
 * Created by admnrabi on 11/07/2018.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(NON_EMPTY)
public class QueryResultDto {

    @JsonProperty("queryText")
    private String queryText;

    @JsonProperty("action")
    private String action;

    @JsonProperty("parameters")
    private ParametersDto parametersDto;

    @JsonProperty("allRequiredParamsPresent")
    private boolean allRequiredParamsPresent;

    @JsonProperty("fulfillmentText")
    private String fulfillmentText;

    @JsonProperty("fulfillmentMessages")
    private List<FulfillmentMessageDto> fulfillmentMessagesDto;

    @JsonProperty("intent")
    private IntentDto intentDto;

    @JsonProperty("intentDetectionConfidence")
    private Integer intentDetectionConfidence;

    @JsonProperty("languageCode")
    private String languageCode;

    public QueryResultDto() {
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ParametersDto getParametersDto() {
        return parametersDto;
    }

    public void setParametersDto(ParametersDto parametersDto) {
        this.parametersDto = parametersDto;
    }

    public boolean isAllRequiredParamsPresent() {
        return allRequiredParamsPresent;
    }

    public void setAllRequiredParamsPresent(boolean allRequiredParamsPresent) {
        this.allRequiredParamsPresent = allRequiredParamsPresent;
    }

    public String getFulfillmentText() {
        return fulfillmentText;
    }

    public void setFulfillmentText(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
    }

    public List<FulfillmentMessageDto> getFulfillmentMessagesDto() {
        return fulfillmentMessagesDto;
    }

    public void setFulfillmentMessagesDto(List<FulfillmentMessageDto> fulfillmentMessagesDto) {
        this.fulfillmentMessagesDto = fulfillmentMessagesDto;
    }

    public IntentDto getIntentDto() {
        return intentDto;
    }

    public void setIntentDto(IntentDto intentDto) {
        this.intentDto = intentDto;
    }

    public Integer getIntentDetectionConfidence() {
        return intentDetectionConfidence;
    }

    public void setIntentDetectionConfidence(Integer intentDetectionConfidence) {
        this.intentDetectionConfidence = intentDetectionConfidence;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @Override
    public String toString() {
        return "QueryResultDto{" +
                "queryText='" + queryText + '\'' +
                ", action='" + action + '\'' +
                ", parametersDto=" + parametersDto +
                ", allRequiredParamsPresent=" + allRequiredParamsPresent +
                ", fulfillmentText='" + fulfillmentText + '\'' +
                ", fulfillmentMessagesDto=" + fulfillmentMessagesDto +
                ", intentDto=" + intentDto +
                ", intentDetectionConfidence=" + intentDetectionConfidence +
                ", languageCode='" + languageCode + '\'' +
                '}';
    }
}
