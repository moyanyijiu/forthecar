package com.xa.pojo;

import java.io.Serializable;

public class Phservice implements Serializable {
    private Integer sid;

    private Integer cid;

    private String sassurance;

    private String stransfer;

    private String scondition;

    private String sreturn;

    private String redundancyone;

    private String redundancytwo;

    private String redundancythr;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getSassurance() {
        return sassurance;
    }

    public void setSassurance(String sassurance) {
        this.sassurance = sassurance == null ? null : sassurance.trim();
    }

    public String getStransfer() {
        return stransfer;
    }

    public void setStransfer(String stransfer) {
        this.stransfer = stransfer == null ? null : stransfer.trim();
    }

    public String getScondition() {
        return scondition;
    }

    public void setScondition(String scondition) {
        this.scondition = scondition == null ? null : scondition.trim();
    }

    public String getSreturn() {
        return sreturn;
    }

    public void setSreturn(String sreturn) {
        this.sreturn = sreturn == null ? null : sreturn.trim();
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