package cn.kgc.k9509.mapper;

import cn.kgc.k9509.pojo.Tbseckillorder;
import cn.kgc.k9509.pojo.TbseckillorderExample;

import java.util.List;

public interface TbseckillorderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tbseckillorder record);

    int insertSelective(Tbseckillorder record);

    List<Tbseckillorder> selectByExample(TbseckillorderExample example);

    Tbseckillorder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tbseckillorder record);

    int updateByPrimaryKey(Tbseckillorder record);
}