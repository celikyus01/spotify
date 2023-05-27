package com.cydeo.g20.handler;

import com.cydeo.g20.models.Album;
import com.cydeo.g20.utilities.DataFactory;
import com.cydeo.g20.utilities.Mapper;
import com.cydeo.g20.utilities.RequestSpecs;
import io.restassured.response.Response;

public class AlbumsHandler extends RequestSpecs {

    public static Album getAlbum(String id, String market)  {
        // Album identifier for test - '4aawyAB9vmqN3uQ7FjRGTy'
        // where query key 'market' is set to 'US'
        Response response = getHttpReqSpecs()
                .queryParams("market",market)
                .get(ALBUMS + id);

        DataFactory.setGetAlbumResponse(response);
       return Mapper.mapAlbum(response);
    }

}
