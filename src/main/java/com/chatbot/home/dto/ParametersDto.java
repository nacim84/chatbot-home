package com.chatbot.home.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by admnrabi on 11/07/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParametersDto {

    @JsonProperty("A")
    private  Long a;

    @JsonProperty("B")
    private  Long b;

    @JsonProperty("OPERATION")
    private String operation;


    public ParametersDto() {
    }

    public Long getA() {
        return a;
    }

    public void setA(Long a) {
        this.a = a;
    }

    public Long getB() {
        return b;
    }

    public void setB(Long b) {
        this.b = b;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "ParametersDto{" +
                "a=" + a +
                ", b=" + b +
                ", operation='" + operation + '\'' +
                '}';
    }
}