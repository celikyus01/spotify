package com.cydeo.g20.models;

import lombok.Data;

import java.util.List;

@Data
public class Album {
    private String album_type;
    private List<Artist> artists;
    private List<Copyright> copyrights;
    private External_id external_ids;
    private ExternalUrls external_urls;
    private List<String> genres;
    private String href;
    private String id;
    private List<Image> images;
    private Boolean is_playable;
    private String label;
    private String name;
    private int popularity;
    private String release_date;
    private String release_date_precision;
    private int total_tracks;
    private Track tracks;
    private String type;
    private String uri;
}
