package cn.kgc.k9509.mapper;

import cn.kgc.k9509.pojo.Tbitem;
import cn.kgc.k9509.pojo.TbitemExample;

import java.util.List;

public interface TbitemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tbitem record);

    int insertSelective(Tbitem record);

    List<Tbitem> selectByExample(TbitemExample example);

    Tbitem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tbitem record);

    int updateByPrimaryKey(Tbitem record);
}