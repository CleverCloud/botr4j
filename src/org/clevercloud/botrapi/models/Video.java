/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.clevercloud.botrapi.models;

import java.util.Set;

/**
 *
 * @author bastien
 */
public class Video {

    private String status;
    private String description;
    private String tags;
    private long views;
    private String title;
    private String mediatype;
    private Custom custom;
    private float duration;
    private String link;
    private String author;
    private String key;
    private String date;

    public Video() {
    }

    public Video(String status, String description, String tags, long views, String title, String mediatype, Custom custom, float duration, String link, String author, String key, String date) {
        this.status = status;
        this.description = description;
        this.tags = tags;
        this.views = views;
        this.title = title;
        this.mediatype = mediatype;
        this.custom = custom;
        this.duration = duration;
        this.link = link;
        this.author = author;
        this.key = key;
        this.date = date;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return the custom
     */
    public Custom getCustom() {
        return custom;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the duration
     */
    public float getDuration() {
        return duration;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * @return the mediatype
     */
    public String getMediatype() {
        return mediatype;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @return the tags
     */
    public String getTags() {
        return tags;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the views
     */
    public long getViews() {
        return views;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * @param views the views to set
     */
    public void setViews(long views) {
        this.views = views;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param mediatype the mediatype to set
     */
    public void setMediatype(String mediatype) {
        this.mediatype = mediatype;
    }

    /**
     * @param custom the custom to set
     */
    public void setCustom(Custom custom) {
        this.custom = custom;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(float duration) {
        this.duration = duration;
    }

    /**
     * @param link the link to set
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

}
