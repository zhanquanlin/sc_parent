package cn.kgc.k9509.mapper;

import cn.kgc.k9509.pojo.Tborder;
import cn.kgc.k9509.pojo.TborderExample;
import java.util.List;

public interface TborderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Tborder record);

    int insertSelective(Tborder record);

    List<Tborder> selectByExample(TborderExample example);

    Tborder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Tborder record);

    int updateByPrimaryKey(Tborder record);
}