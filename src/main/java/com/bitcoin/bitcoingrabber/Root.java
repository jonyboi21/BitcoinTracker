package com.bitcoin.bitcoingrabber;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.Date;
@JsonIgnoreProperties
public class Root {

    @JsonProperty("created_on")
    private String created_on;
    @JsonProperty("unix_time")
    private String unix_time;
    @JsonProperty("expired_time_unix")
    private String expiration_time_unix;
    @JsonProperty("ticker")
    private Ticker ticker;
    @JsonProperty("market")
    private Market market;
    @JsonProperty("rate")
    private String rate;
    @JsonProperty("rate_id")
    private String rate_id;
    @JsonProperty("allowed_historic_price_variance")
    private boolean allowed_historic_price_variance;
    @JsonProperty("allowed_historic_price_age")
    private boolean allowed_historic_price_age;


    public Root() {
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public String getUnix_time() {
        return unix_time;
    }

    public void setUnix_time(String unix_time) {
        this.unix_time = unix_time;
    }

    public String getExpiration_time_unix() {
        return expiration_time_unix;
    }

    public void setExpiration_time_unix(String expiration_time_unix) {
        this.expiration_time_unix = expiration_time_unix;
    }

    public Ticker getTicker() {
        return ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRate_id() {
        return rate_id;
    }

    public void setRate_id(String rate_id) {
        this.rate_id = rate_id;
    }

    public boolean isAllowed_historic_price_variance() {
        return allowed_historic_price_variance;
    }

    public void setAllowed_historic_price_variance(boolean allowed_historic_price_variance) {
        this.allowed_historic_price_variance = allowed_historic_price_variance;
    }

    public boolean isAllowed_historic_price_age() {
        return allowed_historic_price_age;
    }

    public void setAllowed_historic_price_age(boolean allowed_historic_price_age) {
        this.allowed_historic_price_age = allowed_historic_price_age;
    }

    @Override
    public String toString() {
        return "Root{" +
                "created_on='" + created_on + '\'' +
                ", unix_time='" + unix_time + '\'' +
                ", expiration_time_unix='" + expiration_time_unix + '\'' +
                ", ticker=" + ticker +
                ", market=" + market +
                ", rate='" + rate + '\'' +
                ", rate_id='" + rate_id + '\'' +
                ", allowed_historic_price_variance=" + allowed_historic_price_variance +
                ", allowed_historic_price_age=" + allowed_historic_price_age +
                '}';
    }
}

