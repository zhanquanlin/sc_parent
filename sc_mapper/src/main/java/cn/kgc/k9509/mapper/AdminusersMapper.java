package cn.kgc.k9509.mapper;

import cn.kgc.k9509.pojo.Adminusers;
import cn.kgc.k9509.pojo.AdminusersExample;

import java.util.List;

public interface AdminusersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Adminusers record);

    int insertSelective(Adminusers record);

    List<Adminusers> selectByExample(AdminusersExample example);

    Adminusers selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Adminusers record);

    int updateByPrimaryKey(Adminusers record);
}