package com.chatbot.home.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

/**
 * Created by admnrabi on 11/07/2018.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(NON_EMPTY)
public class OriginalDetectIntentRequestDto {

    public PayloadDto getPayloadDto() {
        return payloadDto;
    }

    public void setPayloadDto(PayloadDto payloadDto) {
        this.payloadDto = payloadDto;
    }

    @JsonProperty("payload")
    private PayloadDto payloadDto;

    public OriginalDetectIntentRequestDto() {
    }

}
