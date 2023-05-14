package com.cydeo.g20.handler;

import com.cydeo.g20.models.Artist;
import com.cydeo.g20.utilities.Mapper;
import com.cydeo.g20.utilities.RequestSpecs;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;

public class ArtistsHandler extends RequestSpecs {

    public static void getArtists() throws JsonProcessingException {
        Response response = getHttpReqSpecs().get(ARTISTS + "7uH6CJjqK71HlHW4WHNAJg");
        Artist artist = Mapper.mapArtist(response);

        System.out.println("artist.getId() = " + artist.toString());


    }

    public static void main(String[] args) throws JsonProcessingException {
        getArtists();
    }
}
