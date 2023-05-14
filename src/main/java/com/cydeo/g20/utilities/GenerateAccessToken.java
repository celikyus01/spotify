package com.cydeo.g20.utilities;

import io.restassured.response.Response;

public class GenerateAccessToken extends RequestSpecs {

    public static String generateBearerToken() {
        Response response = getTokenRequestSpecs().post(GENERATE_TOKEN);
        return response.path("token_type") + " " + response.path("access_token");
    }

    public static void main(String[] args) {
        System.out.println(generateBearerToken());
    }
}
