package cn.kgc.k9509.mapper;

import cn.kgc.k9509.pojo.Tbitemparam;
import cn.kgc.k9509.pojo.TbitemparamExample;
import java.util.List;

public interface TbitemparamMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tbitemparam record);

    int insertSelective(Tbitemparam record);

    List<Tbitemparam> selectByExampleWithBLOBs(TbitemparamExample example);

    List<Tbitemparam> selectByExample(TbitemparamExample example);

    Tbitemparam selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tbitemparam record);

    int updateByPrimaryKeyWithBLOBs(Tbitemparam record);

    int updateByPrimaryKey(Tbitemparam record);
}