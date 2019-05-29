package com.xa.service.impl;

import com.xa.dto.PersonnelevaluationDto;
import com.xa.mapper.PhaddevaluationMapper;
import com.xa.mapper.PhpersonnelevaluationMapper;
import com.xa.pojo.Phaddevaluation;
import com.xa.service.PersonnelevaluationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PersonnelevaluationImpl implements PersonnelevaluationService {
    @Resource
    private PhpersonnelevaluationMapper phpersonnelevaluationMapper;
    @Override
    public List<PersonnelevaluationDto> getAllPingLun() {
        return phpersonnelevaluationMapper.getAllPingLun();
    }

    @Override
    public boolean delPinglunById(int id) {
        return phpersonnelevaluationMapper.delPinglunById(id)>0;
    }

    @Override
    public List<PersonnelevaluationDto> getAllPingLunByUser(int id) {
        return phpersonnelevaluationMapper.getAllPingLunByUser(id);
    }

    @Override
    public List<Phaddevaluation> getAddvaluationByUid(int id) {
        return phpersonnelevaluationMapper.getAddvaluationByUid(id);
    }

    @Override
    public boolean delAddPinglun(int id) {
        return phpersonnelevaluationMapper.delAddPinglun(id)>0;
    }

}
