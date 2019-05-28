package com.xa.mapper;

import com.xa.pojo.Phadvice;
import com.xa.pojo.PhadviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhadviceMapper {
    int countByExample(PhadviceExample example);

    int deleteByExample(PhadviceExample example);

    int deleteByPrimaryKey(Integer adid);

    int insert(Phadvice record);

    int insertSelective(Phadvice record);

    List<Phadvice> selectByExample(PhadviceExample example);

    Phadvice selectByPrimaryKey(Integer adid);

    int updateByExampleSelective(@Param("record") Phadvice record, @Param("example") PhadviceExample example);

    int updateByExample(@Param("record") Phadvice record, @Param("example") PhadviceExample example);

    int updateByPrimaryKeySelective(Phadvice record);

    int updateByPrimaryKey(Phadvice record);
}