package cn.kgc.k9509.mapper;

import cn.kgc.k9509.pojo.Tbuser;
import cn.kgc.k9509.pojo.TbuserExample;

import java.util.List;

public interface TbuserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tbuser record);

    int insertSelective(Tbuser record);

    List<Tbuser> selectByExample(TbuserExample example);

    Tbuser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tbuser record);

    int updateByPrimaryKey(Tbuser record);
}