/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.clevercloud.botrapi.models;

import java.util.List;

/**
 *
 * @author bastien
 */
public class VideoRequest {

    private String status;
    private Integer total;
    private Integer limit;
    private Integer offset;
    private List<Video> videos;

    public VideoRequest() {
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

}
