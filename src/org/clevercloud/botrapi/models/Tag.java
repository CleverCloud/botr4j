/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.clevercloud.botrapi.models;

/**
 *
 * @author bastien
 */
public class Tag {

    private String name;
    private Integer videos;

    public Tag() {
    }

    public Tag(String name, Integer videos) {
        this.name = name;
        this.videos = videos;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the videos
     */
    public Integer getVideos() {
        return videos;
    }

    /**
     * @param videos the videos to set
     */
    public void setVideos(Integer videos) {
        this.videos = videos;
    }
}
