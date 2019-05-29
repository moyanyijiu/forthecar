package com.xa.mapper;

import com.xa.dto.PersonnelevaluationDto;
import com.xa.pojo.Phaddevaluation;
import com.xa.pojo.Phpersonnelevaluation;
import com.xa.pojo.PhpersonnelevaluationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PhpersonnelevaluationMapper {
    int countByExample(PhpersonnelevaluationExample example);

    int deleteByExample(PhpersonnelevaluationExample example);

    int deleteByPrimaryKey(Integer feid);

    int insert(Phpersonnelevaluation record);

    int insertSelective(Phpersonnelevaluation record);

    List<Phpersonnelevaluation> selectByExample(PhpersonnelevaluationExample example);

    Phpersonnelevaluation selectByPrimaryKey(Integer feid);

    int updateByExampleSelective(@Param("record") Phpersonnelevaluation record, @Param("example") PhpersonnelevaluationExample example);

    int updateByExample(@Param("record") Phpersonnelevaluation record, @Param("example") PhpersonnelevaluationExample example);

    int updateByPrimaryKeySelective(Phpersonnelevaluation record);

    int updateByPrimaryKey(Phpersonnelevaluation record);

    //查出所有评论
    List<PersonnelevaluationDto> getAllPingLun();

    //查出我的评论
    List<PersonnelevaluationDto> getAllPingLunByUser(int id);

    //删除评论
    int delPinglunById(int id);

   //根据用户id查出追加的评论
    List<Phaddevaluation> getAddvaluationByUid(int id);
    //删除追加评论
    int delAddPinglun(int id);
}