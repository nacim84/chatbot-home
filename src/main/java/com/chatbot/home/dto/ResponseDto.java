package com.chatbot.home.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by admnrabi on 11/07/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseDto {

    @JsonProperty("fulfillmentText")
    private String fulfillmentText;

    @JsonProperty("fulfillmentMessages")
    private List<FulfillmentMessageDto> fulfillmentMessagesDto;

    @JsonProperty("source")
    private String source;

    @JsonProperty("payload")
    private PayloadDto payload;

    @JsonProperty("outputContexts")
    private List<OutputContextsDto> outputContexts;

    @JsonProperty("followupEventInput")
    private FollowupEventInputDto followupEventInput;

    public ResponseDto() {
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public PayloadDto getPayload() {
        return payload;
    }

    public void setPayload(PayloadDto payload) {
        this.payload = payload;
    }

    public List<OutputContextsDto> getOutputContexts() {
        return outputContexts;
    }

    public void setOutputContexts(List<OutputContextsDto> outputContexts) {
        this.outputContexts = outputContexts;
    }

    public FollowupEventInputDto getFollowupEventInput() {
        return followupEventInput;
    }

    public void setFollowupEventInput(FollowupEventInputDto followupEventInput) {
        this.followupEventInput = followupEventInput;
    }
}
