package cn.kgc.k9509.mapper;

import cn.kgc.k9509.pojo.Tbseckillgoods;
import cn.kgc.k9509.pojo.TbseckillgoodsExample;

import java.util.List;

public interface TbseckillgoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tbseckillgoods record);

    int insertSelective(Tbseckillgoods record);

    List<Tbseckillgoods> selectByExample(TbseckillgoodsExample example);

    Tbseckillgoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tbseckillgoods record);

    int updateByPrimaryKey(Tbseckillgoods record);
}