package com.cydeo.g20.utilities;

import com.cydeo.g20.models.Album;
import com.cydeo.g20.models.Artist;
import com.cydeo.g20.models.Track;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

public class Mapper {
    public static Artist mapArtist(Response response) throws JsonProcessingException {
//        return new ObjectMapper().readValue(response.getBody().toString(),Artist.class);
        return response.body().as(Artist.class);
    }
    public static Album mapAlbum(Response response) throws JsonProcessingException {
        return response.body().as(Album.class);
    }
    public static Track mapTrack(Response response) throws JsonProcessingException {
        return response.body().as(Track.class);
    }

}
