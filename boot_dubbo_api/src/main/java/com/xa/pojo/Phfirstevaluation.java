package com.xa.pojo;

import java.io.Serializable;

public class Phfirstevaluation implements Serializable {
    private Integer feid;

    private Integer oid;

    private String fetime;

    private String fecontent;

    private String fenum;

    private String feimg;

    private String redundancyone;

    private String redundancytwo;

    private String redundancythr;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getFeid() {
        return feid;
    }

    public void setFeid(Integer feid) {
        this.feid = feid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getFetime() {
        return fetime;
    }

    public void setFetime(String fetime) {
        this.fetime = fetime == null ? null : fetime.trim();
    }

    public String getFecontent() {
        return fecontent;
    }

    public void setFecontent(String fecontent) {
        this.fecontent = fecontent == null ? null : fecontent.trim();
    }

    public String getFenum() {
        return fenum;
    }

    public void setFenum(String fenum) {
        this.fenum = fenum == null ? null : fenum.trim();
    }

    public String getFeimg() {
        return feimg;
    }

    public void setFeimg(String feimg) {
        this.feimg = feimg == null ? null : feimg.trim();
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