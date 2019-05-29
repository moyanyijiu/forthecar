package com.xa.service;

import com.xa.dto.PersonnelevaluationDto;
import com.xa.pojo.Phaddevaluation;

import java.util.List;

public interface PersonnelevaluationService {
    //查出所有的评论
    List<PersonnelevaluationDto> getAllPingLun();
    //删除评论
    boolean delPinglunById(int id);

    //查出我的评论
    List<PersonnelevaluationDto> getAllPingLunByUser(int id);

    //根据用户id查出追加的评论
    List<Phaddevaluation> getAddvaluationByUid(int id);

    //删除追加评论
    boolean delAddPinglun(int id);

}
