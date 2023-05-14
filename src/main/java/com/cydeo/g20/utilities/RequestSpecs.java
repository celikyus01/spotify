package com.cydeo.g20.utilities;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecs implements Endpoints {

    public static RequestSpecification getTokenRequestSpecs() {
        return RestAssured.given().config(RestAssured.config()
                        .encoderConfig(EncoderConfig.encoderConfig()
                                .encodeContentTypeAs("x-www-form-urlencoded",
                                        ContentType.URLENC)))
                .contentType(ContentType.URLENC.withCharset("UTF-8"))
                .formParam("grant_type", "client_credentials")
                .formParam("client_id", ConfigurationReader.getClientid())
                .formParam("client_secret", ConfigurationReader.getClientSecret())
                .baseUri(ConfigurationReader.getTokenUrl());
    }

    public static RequestSpecification getHttpReqSpecs(){

        return RestAssured.given().accept(ContentType.JSON).baseUri(ConfigurationReader.getBaseUrl())
                .header("Authorization", GenerateAccessToken.generateBearerToken());

    }


}
