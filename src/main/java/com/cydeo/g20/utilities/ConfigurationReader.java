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

    private static String get(String keyName) {
        return properties.getProperty(keyName);
    }

    public static String getTokenUrl(){
        String url = get("tokenUrl");
        if(url==null)
            throw new NullPointerException("The token url could not be found");
        return url;
    }

    public static String getBaseUrl(){
        String url = get("baseUrl");
        if(url==null)
            throw new NullPointerException("The base url could not be found");
        return url;
    }

    public static String getClientid(){
        String clientId = get("clientId");
        if(clientId==null)
            throw new NullPointerException("The cleint id could not be found");
        return clientId;
    }

    public static String getClientSecret(){
        String clientSecret = get("clientSecret");
        if(clientSecret==null)
            throw new NullPointerException("The cleint secret could not be found");
        return clientSecret;
    }

    public static String getRequestUrl(String endpoint, String id){
        return getBaseUrl()+endpoint+id;
    }


}