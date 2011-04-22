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
public class TagRequest {
    private String status;
    private Integer total;
    private Integer limit;
    private Integer offset;
    private List<Tag> tags;

    public TagRequest() {
    }

    public TagRequest(String status, Integer total, Integer limit, Integer offset, List<Tag> tags) {
        this.status = status;
        this.total = total;
        this.limit = limit;
        this.offset = offset;
        this.tags = tags;
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
     * @return the total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * @return the limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * @param limit the limit to set
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * @return the offset
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * @param offset the offset to set
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * @return the tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

}
