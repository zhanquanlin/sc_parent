package cn.kgc.k9509.mapper;

import cn.kgc.k9509.pojo.Tborderitem;
import cn.kgc.k9509.pojo.TborderitemExample;
import java.util.List;

public interface TborderitemMapper {
    int deleteByPrimaryKey(String id);

    int insert(Tborderitem record);

    int insertSelective(Tborderitem record);

    List<Tborderitem> selectByExample(TborderitemExample example);

    Tborderitem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Tborderitem record);

    int updateByPrimaryKey(Tborderitem record);
}