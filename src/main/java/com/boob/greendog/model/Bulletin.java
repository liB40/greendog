package com.boob.greendog.model;

import java.util.Date;

public class Bulletin {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bulletin.id
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bulletin.publisher_id
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    private Long publisherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bulletin.title
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bulletin.gmt_created
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    private Date gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bulletin.gmt_modified
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bulletin.contant
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    private String contant;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bulletin.id
     *
     * @return the value of bulletin.id
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bulletin.id
     *
     * @param id the value for bulletin.id
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bulletin.publisher_id
     *
     * @return the value of bulletin.publisher_id
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    public Long getPublisherId() {
        return publisherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bulletin.publisher_id
     *
     * @param publisherId the value for bulletin.publisher_id
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bulletin.title
     *
     * @return the value of bulletin.title
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bulletin.title
     *
     * @param title the value for bulletin.title
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bulletin.gmt_created
     *
     * @return the value of bulletin.gmt_created
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bulletin.gmt_created
     *
     * @param gmtCreated the value for bulletin.gmt_created
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bulletin.gmt_modified
     *
     * @return the value of bulletin.gmt_modified
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bulletin.gmt_modified
     *
     * @param gmtModified the value for bulletin.gmt_modified
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bulletin.contant
     *
     * @return the value of bulletin.contant
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    public String getContant() {
        return contant;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bulletin.contant
     *
     * @param contant the value for bulletin.contant
     *
     * @mbg.generated Wed Mar 11 13:06:12 CST 2020
     */
    public void setContant(String contant) {
        this.contant = contant == null ? null : contant.trim();
    }
}