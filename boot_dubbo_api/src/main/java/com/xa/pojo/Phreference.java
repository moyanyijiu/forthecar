package com.xa.pojo;

import java.io.Serializable;

public class Phreference implements Serializable {
    private Integer rid;

    private Integer cid;

    private String rnewcarprice;

    private String rmerchantprice;

    private String rmaxprice;

    private String rminprice;

    private String rmarkettime;

    private String redundancyone;

    private String redundancytwo;

    private String redundancythr;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getRnewcarprice() {
        return rnewcarprice;
    }

    public void setRnewcarprice(String rnewcarprice) {
        this.rnewcarprice = rnewcarprice == null ? null : rnewcarprice.trim();
    }

    public String getRmerchantprice() {
        return rmerchantprice;
    }

    public void setRmerchantprice(String rmerchantprice) {
        this.rmerchantprice = rmerchantprice == null ? null : rmerchantprice.trim();
    }

    public String getRmaxprice() {
        return rmaxprice;
    }

    public void setRmaxprice(String rmaxprice) {
        this.rmaxprice = rmaxprice == null ? null : rmaxprice.trim();
    }

    public String getRminprice() {
        return rminprice;
    }

    public void setRminprice(String rminprice) {
        this.rminprice = rminprice == null ? null : rminprice.trim();
    }

    public String getRmarkettime() {
        return rmarkettime;
    }

    public void setRmarkettime(String rmarkettime) {
        this.rmarkettime = rmarkettime == null ? null : rmarkettime.trim();
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