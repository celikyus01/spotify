package com.cydeo.g20.stepDefs;

import com.cydeo.g20.handler.AlbumsHandler;
import com.cydeo.g20.utilities.ConfigurationReader;
import com.cydeo.g20.utilities.DataFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class AlbumsStepDefs {
    @Given("I get albums with id {string} and country {string}")
    public void iGetAlbumsWithIdAndCountry(String id, String market) {
        DataFactory.setAlbum( AlbumsHandler.getAlbum(id, market));
    }

    @And("I verify {int} status code")
    public void iVerifyStatusCode(int expectedStatusCode) {
        int actualStatusCode = DataFactory.getGetAlbumResponse().statusCode();
        Assert.assertEquals(String.format("expected status code was expected to be %s, but found %s", expectedStatusCode,actualStatusCode),
                expectedStatusCode,actualStatusCode);

    }

    public static void main(String[] args) {

        formatPractice("pilot", "qa");

    }


    public static void formatPractice(String desired, String actual){

        String result = String.format("I want to be a %s, but I became %s", desired, actual);

        String s = "I want to be a " + desired + ", but I became " + actual;

        ConfigurationReader.getProperty("env");
        String env = ConfigurationReader.getEnv();

        System.out.println("result = " + result);


    }

}
