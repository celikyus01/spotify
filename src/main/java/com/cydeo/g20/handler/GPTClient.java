package com.cydeo.g20.handler;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GPTClient {
    public static void main(String[] args) {
        // Set the GPT API endpoint URL
        String url = "https://api.openai.com/v1/images/generations";

        String requestOfImage = "fast running car, high resolution";

        String body = "{\n" +
                "    \"prompt\": \""+ requestOfImage + "\",\n" +
                "    \"n\": 2,\n" +
                "    \"size\": \"1024x1024\"\n" +
                "  }";

        // Set your OpenAI API key
        String apiKey = "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";



        // Set the request headers
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + apiKey)
                .body(body).log().all()

                // Send the POST request
                .post(url)

                // Get the response
                .then()
                .statusCode(200)
                .extract().response();

        // Print the response
        System.out.println("Response Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}