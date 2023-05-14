package com.cydeo.g20.handler;

import com.cydeo.g20.utilities.RequestSpecs;

public class AlbumsHandler extends RequestSpecs {

    public static void getAlbum() {


        getHttpReqSpecs().param( "6wiEd40oPbQ9UK1rSpIy8I").get(ALBUMS).prettyPrint();

    }

    public static void main(String[] args) {
        getAlbum();
    }

}
