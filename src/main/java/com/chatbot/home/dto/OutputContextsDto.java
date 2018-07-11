package com.chatbot.home.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by admnrabi on 11/07/2018.
 */
public class OutputContextsDto {

    @JsonProperty("name")
    private String name;

    @JsonProperty("lifespanCount")
    private Long lifespanCount = new Long(5);

    @JsonProperty("parameters")
    private ParametersDto parameters;

    public OutputContextsDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLifespanCount() {
        return lifespanCount;
    }

    public void setLifespanCount(Long lifespanCount) {
        this.lifespanCount = lifespanCount;
    }

    public ParametersDto getParameters() {
        return parameters;
    }

    public void setParameters(ParametersDto parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "OutputContextsDto{" +
                "name='" + name + '\'' +
                ", lifespanCount=" + lifespanCount +
                ", parameters=" + parameters +
                '}';
    }
}
