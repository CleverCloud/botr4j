/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testbotr;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.clevercloud.botrapi.BotrAPI;
import org.clevercloud.botrapi.converters.VideosRequestConverter;
import org.clevercloud.botrapi.models.Video;
import org.clevercloud.botrapi.models.VideoRequest;

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
        List<Video> videos = botr.getVideos();

        System.out.println(videos.get(0).getAuthor());
    }
}
