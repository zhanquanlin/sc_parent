package cn.kgc.k9509.sc_con.controller;

import cn.kgc.k9509.feign.Feigninterface;
import cn.kgc.k9509.pojo.Tbuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2020/3/12 15:56
 * @Created by Alina
 */
@RestController
public class UserController {
    @Autowired(required = false)
    Feigninterface feigninterface;

    @RequestMapping("/list")
    public List<Tbuser> list(){
        List<Tbuser> prolist = feigninterface.prolist();
        return prolist;
    }
}