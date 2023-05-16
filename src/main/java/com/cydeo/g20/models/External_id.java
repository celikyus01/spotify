package com.cydeo.g20.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class External_id {
    @JsonAlias({"isrc", "upc"})
    private String upc;
}
