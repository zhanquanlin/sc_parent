package cn.kgc.k9509.mapper;

import cn.kgc.k9509.pojo.Tbcontentcategory;
import cn.kgc.k9509.pojo.TbcontentcategoryExample;

import java.util.List;

public interface TbcontentcategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tbcontentcategory record);

    int insertSelective(Tbcontentcategory record);

    List<Tbcontentcategory> selectByExample(TbcontentcategoryExample example);

    Tbcontentcategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tbcontentcategory record);

    int updateByPrimaryKey(Tbcontentcategory record);
}