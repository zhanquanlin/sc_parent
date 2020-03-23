package cn.kgc.k9509.sc_pro.service;

import cn.kgc.k9509.mapper.TbuserMapper;
import cn.kgc.k9509.pojo.Tbuser;
import cn.kgc.k9509.pojo.TbuserExample;
import cn.kgc.k9509.service.UserSetvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname Userserviceimpl
 * @Description TODO
 * @Date 2020/3/12 15:59
 * @Created by Alina
 */
@Service
public class Userserviceimpl implements UserSetvice {
    @Autowired(required = false)
    TbuserMapper tbuserMapper;
    @Override
    public List<Tbuser> selecttbuser() {
        List<Tbuser> tbusers = tbuserMapper.selectByExample(new TbuserExample());
        return tbusers;
    }
}