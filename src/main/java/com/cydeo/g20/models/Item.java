package com.cydeo.g20.models;

import lombok.Data;

import java.util.List;

@Data
public class Item {
    private List<Artist> artists;
    private int disc_number;
    private int duration_ms;
    private Boolean explicit;
    private ExternalUrls external_urls;
    private String href;
    private String id;
    private Boolean is_local;
    private Boolean is_playable;
    private LinkedFrom linked_from;
    private String name;
    private String preview_url;
    private Restriction restrictions;
    private int track_number;
    private String type;
    private String uri;
}
