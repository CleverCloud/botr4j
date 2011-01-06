/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testbotr;

import java.io.FileReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;
import org.clevercloud.botrapi.BotrAPI;

/**
 *
 * @author waxzce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException,
            IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("/etc/botrcreds.properties"));
        String key = properties.getProperty("key");
        String secret = properties.getProperty("secret");
        BotrAPI botr = new BotrAPI(key, secret);

        System.out.println(botr.getVideos());
        System.out.println(botr.getAccountContents());

    }
}
