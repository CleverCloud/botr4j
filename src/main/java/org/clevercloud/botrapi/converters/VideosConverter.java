/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clevercloud.botrapi.converters;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.clevercloud.botrapi.models.Video;

/**
 *
 * @author bastien
 */
public class VideosConverter implements JsonDeserializer<Video> {

    public Video deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) {
        Iterator<Entry<String, JsonElement>> it = je.getAsJsonObject().entrySet().iterator();
        Video v = new Video();
        Class c = Video.class;
        while (it.hasNext()) {
            Entry<String, JsonElement> entry = it.next();
            try {
                Field f = c.getDeclaredField(entry.getKey());
                Boolean b = f.isAccessible();
                f.setAccessible(true);
                f.set(v, jdc.deserialize(entry.getValue(), f.getType()));
                f.setAccessible(b);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(VideosConverter.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(VideosConverter.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchFieldException ex) {
                if (v.getUnknownField() == null)
                    v.setUnknownField(new HashMap<String, String>());
                v.getUnknownField().put(entry.getKey(), entry.getValue().toString());
                Logger.getLogger(VideosConverter.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SecurityException ex) {
                Logger.getLogger(VideosConverter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return v;
    }
}
