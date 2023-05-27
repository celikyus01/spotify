package com.cydeo.g20.utilities;

import com.cydeo.g20.models.Album;
import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;


public class DataFactory {
    @Getter @Setter
    private static Response getAlbumResponse;
    @Getter @Setter
    private static Album album;


    public static void resetData(){
        getAlbumResponse =null;
    }

}
