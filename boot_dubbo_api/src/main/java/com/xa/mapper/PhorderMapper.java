package com.xa.mapper;

import com.xa.pojo.Phorder;
import com.xa.pojo.PhorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhorderMapper {
    int countByExample(PhorderExample example);

    int deleteByExample(PhorderExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(Phorder record);

    int insertSelective(Phorder record);

    List<Phorder> selectByExample(PhorderExample example);

    Phorder selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") Phorder record, @Param("example") PhorderExample example);

    int updateByExample(@Param("record") Phorder record, @Param("example") PhorderExample example);

    int updateByPrimaryKeySelective(Phorder record);

    int updateByPrimaryKey(Phorder record);
}