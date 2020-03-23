package cn.kgc.k9509.mapper;

import cn.kgc.k9509.pojo.Tbcontent;
import cn.kgc.k9509.pojo.TbcontentExample;
import java.util.List;

public interface TbcontentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tbcontent record);

    int insertSelective(Tbcontent record);

    List<Tbcontent> selectByExample(TbcontentExample example);

    Tbcontent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tbcontent record);

    int updateByPrimaryKey(Tbcontent record);
}