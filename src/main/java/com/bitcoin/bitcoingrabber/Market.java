package com.bitcoin.bitcoingrabber;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Market {
    @JsonProperty( "name" )
    private String name;

    @JsonProperty("code")
    private String code;

    public Market() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Market{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }


}
