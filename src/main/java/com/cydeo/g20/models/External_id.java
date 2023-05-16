package com.cydeo.g20.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class External_id {
    @JsonProperty("isrc")
    private String upc;
}
