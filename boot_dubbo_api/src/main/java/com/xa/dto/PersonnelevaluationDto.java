package com.xa.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PersonnelevaluationDto implements Serializable {
    /*f.feid,car.cqualityimg,car.redundancyone,f.fetime,f.fecontent,user.uname*/
    private int feid;
    private String cqualityimg;
    private String  redundancyone;
    private String fetime;
    private String fecontent;
    private String uname;

}
