/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.clevercloud.botrapi.models;

/**
 *
 * @author bastien
 */
public class View {

    private String status;
    private Integer pageviews;
    private Integer views;
    private Integer downloads;
    private String title;
    private Integer streams;
    private String key;
    private Integer viewed;

    public View() {
    }

    public View(String status, Integer pageviews, Integer views, Integer downloads, String title, Integer streams, String key, Integer viewed) {
        this.status = status;
        this.pageviews = pageviews;
        this.views = views;
        this.downloads = downloads;
        this.title = title;
        this.streams = streams;
        this.key = key;
        this.viewed = viewed;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the pageviews
     */
    public Integer getPageviews() {
        return pageviews;
    }

    /**
     * @param pageviews the pageviews to set
     */
    public void setPageviews(Integer pageviews) {
        this.pageviews = pageviews;
    }

    /**
     * @return the views
     */
    public Integer getViews() {
        return views;
    }

    /**
     * @param views the views to set
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     * @return the downloads
     */
    public Integer getDownloads() {
        return downloads;
    }

    /**
     * @param downloads the downloads to set
     */
    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the streams
     */
    public Integer getStreams() {
        return streams;
    }

    /**
     * @param streams the streams to set
     */
    public void setStreams(Integer streams) {
        this.streams = streams;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the viewed
     */
    public Integer getViewed() {
        return viewed;
    }

    /**
     * @param viewed the viewed to set
     */
    public void setViewed(Integer viewed) {
        this.viewed = viewed;
    }

    
}
