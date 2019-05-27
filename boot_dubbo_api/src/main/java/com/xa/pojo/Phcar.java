package com.xa.pojo;

import java.io.Serializable;

public class Phcar implements Serializable {
    private Integer cid;

    private Integer uid;

    private String cbrand;

    private String ctype;

    private String cmileage;

    private String ctransmission;

    private String cdisplacement;

    private String ccolor;

    private String cbuytime;

    private String cselltime;

    private String cearthly;

    private String cservice;

    private String cqualityimg;

    private Integer cbstime;

    private Integer csore;

    private String cdetailsimg;

    private String cspeedimg;

    private String redundancyone;

    private String redundancytwo;

    private String redundancythr;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getCbrand() {
        return cbrand;
    }

    public void setCbrand(String cbrand) {
        this.cbrand = cbrand == null ? null : cbrand.trim();
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype == null ? null : ctype.trim();
    }

    public String getCmileage() {
        return cmileage;
    }

    public void setCmileage(String cmileage) {
        this.cmileage = cmileage == null ? null : cmileage.trim();
    }

    public String getCtransmission() {
        return ctransmission;
    }

    public void setCtransmission(String ctransmission) {
        this.ctransmission = ctransmission == null ? null : ctransmission.trim();
    }

    public String getCdisplacement() {
        return cdisplacement;
    }

    public void setCdisplacement(String cdisplacement) {
        this.cdisplacement = cdisplacement == null ? null : cdisplacement.trim();
    }

    public String getCcolor() {
        return ccolor;
    }

    public void setCcolor(String ccolor) {
        this.ccolor = ccolor == null ? null : ccolor.trim();
    }

    public String getCbuytime() {
        return cbuytime;
    }

    public void setCbuytime(String cbuytime) {
        this.cbuytime = cbuytime == null ? null : cbuytime.trim();
    }

    public String getCselltime() {
        return cselltime;
    }

    public void setCselltime(String cselltime) {
        this.cselltime = cselltime == null ? null : cselltime.trim();
    }

    public String getCearthly() {
        return cearthly;
    }

    public void setCearthly(String cearthly) {
        this.cearthly = cearthly == null ? null : cearthly.trim();
    }

    public String getCservice() {
        return cservice;
    }

    public void setCservice(String cservice) {
        this.cservice = cservice == null ? null : cservice.trim();
    }

    public String getCqualityimg() {
        return cqualityimg;
    }

    public void setCqualityimg(String cqualityimg) {
        this.cqualityimg = cqualityimg == null ? null : cqualityimg.trim();
    }

    public Integer getCbstime() {
        return cbstime;
    }

    public void setCbstime(Integer cbstime) {
        this.cbstime = cbstime;
    }

    public Integer getCsore() {
        return csore;
    }

    public void setCsore(Integer csore) {
        this.csore = csore;
    }

    public String getCdetailsimg() {
        return cdetailsimg;
    }

    public void setCdetailsimg(String cdetailsimg) {
        this.cdetailsimg = cdetailsimg == null ? null : cdetailsimg.trim();
    }

    public String getCspeedimg() {
        return cspeedimg;
    }

    public void setCspeedimg(String cspeedimg) {
        this.cspeedimg = cspeedimg == null ? null : cspeedimg.trim();
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