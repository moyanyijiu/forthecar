package com.xa.test;

import com.xa.dto.PersonnelevaluationDto;
import com.xa.service.impl.PersonnelevaluationImpl;
import org.junit.Test;
import javax.annotation.Resource;
import java.util.List;

public class Test1 {
  @Resource
  private PersonnelevaluationImpl personnelevaluation;

    @Test
    public void test1(){
        List<PersonnelevaluationDto> allPingLun = personnelevaluation.getAllPingLun();
        System.out.println(allPingLun);
    }
}
