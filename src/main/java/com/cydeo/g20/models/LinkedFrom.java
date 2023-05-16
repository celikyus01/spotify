package com.cydeo.g20.models;

import lombok.Data;

@Data
public class LinkedFrom {
    private ExternalUrls external_urls;
    private String href;
    private String id;
    private String type;
    private String uri;
}
