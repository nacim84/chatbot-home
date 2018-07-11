package com.chatbot.home.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by admnrabi on 11/07/2018.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class FulfillmentMessageDto {

    @JsonProperty("text")
    private TextDto text;

    public FulfillmentMessageDto() {
    }

    public TextDto getText() {
        return text;
    }

    public void setText(TextDto text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "FulfillmentMessageDto{" +
                "text=" + text +
                '}';
    }
}
