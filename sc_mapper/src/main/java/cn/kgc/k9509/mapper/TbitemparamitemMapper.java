package cn.kgc.k9509.mapper;

import cn.kgc.k9509.pojo.Tbitemparamitem;
import cn.kgc.k9509.pojo.TbitemparamitemExample;

import java.util.List;

public interface TbitemparamitemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tbitemparamitem record);

    int insertSelective(Tbitemparamitem record);

    List<Tbitemparamitem> selectByExampleWithBLOBs(TbitemparamitemExample example);

    List<Tbitemparamitem> selectByExample(TbitemparamitemExample example);

    Tbitemparamitem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tbitemparamitem record);

    int updateByPrimaryKeyWithBLOBs(Tbitemparamitem record);

    int updateByPrimaryKey(Tbitemparamitem record);
}