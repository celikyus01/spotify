package com.cydeo.g20.handler;

import com.cydeo.g20.models.Album;
import com.cydeo.g20.utilities.Mapper;
import com.cydeo.g20.utilities.RequestSpecs;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;

public class AlbumsHandler extends RequestSpecs {

    public static void getAlbum() throws JsonProcessingException {

        // Album identifier for test - '4aawyAB9vmqN3uQ7FjRGTy'
        // where query key 'market' is set to 'US'

        Response response = getHttpReqSpecs()
                .queryParams("market","US")
                .get(ALBUMS + "4aawyAB9vmqN3uQ7FjRGTy");

        Album album = Mapper.mapAlbum(response);

        System.out.println("artist.getId() = " + album.toString());

    }

    public static void main(String[] args) throws JsonProcessingException {
        getAlbum();
    }

}
