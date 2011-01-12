/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clevercloud.botrapi.converters;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.clevercloud.botrapi.models.Video;
import org.clevercloud.botrapi.models.VideoRequest;

/**
 *
 * @author bastien
 */
public class VideosRequestConverter implements JsonDeserializer<VideoRequest> {

    public VideoRequest deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        Iterator<Entry<String, JsonElement>> it = je.getAsJsonObject().entrySet().iterator();
        VideoRequest vr = new VideoRequest();
        Type listType = new TypeToken<List<Video>>() {
        }.getType();

        Gson g = new GsonBuilder().registerTypeAdapter(Video.class, new VideosConverter()).create();
        Class c = VideoRequest.class;

        while (it.hasNext()) {
            try {
                Entry<String, JsonElement> entry = it.next();
                Field f = c.getDeclaredField(entry.getKey());
                Boolean b = f.isAccessible();
                f.setAccessible(true);
                if (f.getGenericType() instanceof ParameterizedType) {
                    ParameterizedType pt = (ParameterizedType) f.getGenericType();
                    f.set(vr, g.fromJson(entry.getValue(), TypeToken.get(pt).getType()));
                } else {
                    f.set(vr, g.fromJson(entry.getValue(), f.getType()));
                }
                f.setAccessible(b);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(VideosRequestConverter.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(VideosRequestConverter.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchFieldException ex) {
                Logger.getLogger(VideosRequestConverter.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SecurityException ex) {
                Logger.getLogger(VideosRequestConverter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return vr;

    }
}
