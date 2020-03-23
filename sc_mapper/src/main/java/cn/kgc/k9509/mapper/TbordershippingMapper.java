package cn.kgc.k9509.mapper;

import cn.kgc.k9509.pojo.Tbordershipping;
import cn.kgc.k9509.pojo.TbordershippingExample;

import java.util.List;

public interface TbordershippingMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Tbordershipping record);

    int insertSelective(Tbordershipping record);

    List<Tbordershipping> selectByExample(TbordershippingExample example);

    Tbordershipping selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Tbordershipping record);

    int updateByPrimaryKey(Tbordershipping record);
}