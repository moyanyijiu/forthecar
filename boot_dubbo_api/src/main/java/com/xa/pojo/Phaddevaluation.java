package com.xa.pojo;

import java.io.Serializable;

public class Phaddevaluation implements Serializable {
    private Integer aeid;

    private Integer feid;

    private String aefeel;

    private String aefimg;

    private String aeservice;

    private String aesimg;

    private String redundancyone;

    private String redundancytwo;

    private String redundancythr;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getAeid() {
        return aeid;
    }

    public void setAeid(Integer aeid) {
        this.aeid = aeid;
    }

    public Integer getFeid() {
        return feid;
    }

    public void setFeid(Integer feid) {
        this.feid = feid;
    }

    public String getAefeel() {
        return aefeel;
    }

    public void setAefeel(String aefeel) {
        this.aefeel = aefeel == null ? null : aefeel.trim();
    }

    public String getAefimg() {
        return aefimg;
    }

    public void setAefimg(String aefimg) {
        this.aefimg = aefimg == null ? null : aefimg.trim();
    }

    public String getAeservice() {
        return aeservice;
    }

    public void setAeservice(String aeservice) {
        this.aeservice = aeservice == null ? null : aeservice.trim();
    }

    public String getAesimg() {
        return aesimg;
    }

    public void setAesimg(String aesimg) {
        this.aesimg = aesimg == null ? null : aesimg.trim();
    }

    public String getRedundancyone() {
        return redundancyone;
    }

    public void setRedundancyone(String redundancyone) {
        this.redundancyone = redundancyone == null ? null : redundancyone.trim();
    }

    public String getRedundancytwo() {
        return redundancytwo;
    }

    public void setRedundancytwo(String redundancytwo) {
        this.redundancytwo = redundancytwo == null ? null : redundancytwo.trim();
    }

    public String getRedundancythr() {
        return redundancythr;
    }

    public void setRedundancythr(String redundancythr) {
        this.redundancythr = redundancythr == null ? null : redundancythr.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}