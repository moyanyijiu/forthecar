package com.xa.mapper;

import com.xa.pojo.Phcomplaints;
import com.xa.pojo.PhcomplaintsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhcomplaintsMapper {
    int countByExample(PhcomplaintsExample example);

    int deleteByExample(PhcomplaintsExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Phcomplaints record);

    int insertSelective(Phcomplaints record);

    List<Phcomplaints> selectByExample(PhcomplaintsExample example);

    Phcomplaints selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Phcomplaints record, @Param("example") PhcomplaintsExample example);

    int updateByExample(@Param("record") Phcomplaints record, @Param("example") PhcomplaintsExample example);

    int updateByPrimaryKeySelective(Phcomplaints record);

    int updateByPrimaryKey(Phcomplaints record);
}