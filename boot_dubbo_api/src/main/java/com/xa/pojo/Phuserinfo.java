package com.xa.pojo;

import java.io.Serializable;

public class Phuserinfo implements Serializable {
    private Integer uiid;

    private Integer uid;

    private String uiemail;

    private String uiadress;

    private String uiphone;

    private String uiqq;

    private String uibrthday;

    private String uiwork;

    private String uitype;

    private String uilocation;

    private String redundancyone;

    private String redundancytwo;

    private String redundancythr;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getUiid() {
        return uiid;
    }

    public void setUiid(Integer uiid) {
        this.uiid = uiid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUiemail() {
        return uiemail;
    }

    public void setUiemail(String uiemail) {
        this.uiemail = uiemail == null ? null : uiemail.trim();
    }

    public String getUiadress() {
        return uiadress;
    }

    public void setUiadress(String uiadress) {
        this.uiadress = uiadress == null ? null : uiadress.trim();
    }

    public String getUiphone() {
        return uiphone;
    }

    public void setUiphone(String uiphone) {
        this.uiphone = uiphone == null ? null : uiphone.trim();
    }

    public String getUiqq() {
        return uiqq;
    }

    public void setUiqq(String uiqq) {
        this.uiqq = uiqq == null ? null : uiqq.trim();
    }

    public String getUibrthday() {
        return uibrthday;
    }

    public void setUibrthday(String uibrthday) {
        this.uibrthday = uibrthday == null ? null : uibrthday.trim();
    }

    public String getUiwork() {
        return uiwork;
    }

    public void setUiwork(String uiwork) {
        this.uiwork = uiwork == null ? null : uiwork.trim();
    }

    public String getUitype() {
        return uitype;
    }

    public void setUitype(String uitype) {
        this.uitype = uitype == null ? null : uitype.trim();
    }

    public String getUilocation() {
        return uilocation;
    }

    public void setUilocation(String uilocation) {
        this.uilocation = uilocation == null ? null : uilocation.trim();
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