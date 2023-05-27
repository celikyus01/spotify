package com.cydeo.g20.utilities;


import java.io.FileInputStream;
import java.util.Properties;

/**
 * reads the properties file configuration.properties
 */
public class ConfigurationReader {

    private static Properties properties;

    static {

        try {
            String path = "configuration.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static String getProperty(String keyName) {
        return properties.getProperty(keyName);
    }

    public static String getTokenUrl() {
        String url = getProperty("tokenUrl");
        if (url == null)
            throw new NullPointerException("The token url could not be found");
        return url;
    }

    public static String getClientid() {
        String clientId = getProperty("clientId");
        if (clientId == null)
            throw new NullPointerException("The cleint id could not be found");
        return clientId;
    }

    public static String getClientSecret() {
        String clientSecret = getProperty("clientSecret");
        if (clientSecret == null)
            throw new NullPointerException("The cleint secret could not be found");
        return clientSecret;
    }

    public static String getRequestUrl(String endpoint, String id) {
        return getBaseUrl() + endpoint + id;
    }

    public static String getUsernameByUserId(String userId) {
        return String.format(getProperty("formatTest"), userId);

    }

    public static String getBaseUrl() {
        String env = null;
        if (getEnv().equals("test"))
            env = "";
        else env = getEnv();

        return String.format(getProperty("baseUrl"), env);
    }

    public static String getEnv() {
        return getProperty("env");
    }


    public static void main(String[] args) {
        String usernameByUserId = getUsernameByUserId("123");
        System.out.println("usernameByUserId = " + usernameByUserId);

    }


}