package com.cydeo.g20.handler;

import com.cydeo.g20.models.Track;
import com.cydeo.g20.utilities.Mapper;
import com.cydeo.g20.utilities.RequestSpecs;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;

public class TracksHandler extends RequestSpecs {

    public static void getTrack() throws JsonProcessingException {

        // Track identifier for test - '11dFghVXANMlKmJXsNCbNl'
        // where query key 'market' is set to 'US'

        Response response = getHttpReqSpecs()
                .queryParams("market","US")
                .get(TRACKS + "11dFghVXANMlKmJXsNCbNl");

        Track track = Mapper.mapTrack(response);

        System.out.println("artist.getId() = " + track.toString());

    }

    public static void main(String[] args) throws JsonProcessingException {
        getTrack();
    }

}
