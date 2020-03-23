package cn.kgc.k9509.mapper;

import cn.kgc.k9509.pojo.Tbitemcat;
import cn.kgc.k9509.pojo.TbitemcatExample;
import java.util.List;

public interface TbitemcatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tbitemcat record);

    int insertSelective(Tbitemcat record);

    List<Tbitemcat> selectByExample(TbitemcatExample example);

    Tbitemcat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tbitemcat record);

    int updateByPrimaryKey(Tbitemcat record);
}