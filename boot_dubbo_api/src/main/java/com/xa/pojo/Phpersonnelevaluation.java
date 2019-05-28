package com.xa.pojo;

import java.io.Serializable;

public class Phpersonnelevaluation implements Serializable {
    private Integer feid;

    private Integer oid;

    private Integer feappraiser;

    private Integer fesale;

    private Integer fetransfer;

    private Integer feinstallment;

    private String feaeva;

    private String feseva;

    private String feteva;

    private String feieva;

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

    public Integer getFeappraiser() {
        return feappraiser;
    }

    public void setFeappraiser(Integer feappraiser) {
        this.feappraiser = feappraiser;
    }

    public Integer getFesale() {
        return fesale;
    }

    public void setFesale(Integer fesale) {
        this.fesale = fesale;
    }

    public Integer getFetransfer() {
        return fetransfer;
    }

    public void setFetransfer(Integer fetransfer) {
        this.fetransfer = fetransfer;
    }

    public Integer getFeinstallment() {
        return feinstallment;
    }

    public void setFeinstallment(Integer feinstallment) {
        this.feinstallment = feinstallment;
    }

    public String getFeaeva() {
        return feaeva;
    }

    public void setFeaeva(String feaeva) {
        this.feaeva = feaeva == null ? null : feaeva.trim();
    }

    public String getFeseva() {
        return feseva;
    }

    public void setFeseva(String feseva) {
        this.feseva = feseva == null ? null : feseva.trim();
    }

    public String getFeteva() {
        return feteva;
    }

    public void setFeteva(String feteva) {
        this.feteva = feteva == null ? null : feteva.trim();
    }

    public String getFeieva() {
        return feieva;
    }

    public void setFeieva(String feieva) {
        this.feieva = feieva == null ? null : feieva.trim();
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