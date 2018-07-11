package com.chatbot.home.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by admnrabi on 11/07/2018.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class TextDto {

    @JsonProperty("text")
    List<String> text;

    public TextDto() {
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }



}
