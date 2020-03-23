package cn.kgc.k9509.sc_pro.controller;

import cn.kgc.k9509.pojo.Adminusers;
import cn.kgc.k9509.pojo.Tbuser;
import cn.kgc.k9509.pojodemo.UserDemo;
import cn.kgc.k9509.service.UserSetvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Classname Usercontroller
 * @Description TODO
 * @Date 2020/3/12 16:03
 * @Created by Alina
 */
@RestController
public class Usercontroller {

    @Autowired(required = false)
    UserSetvice userSetvice;
    @RequestMapping("/prolist")
    public List<Tbuser> prolist(){
        List<Tbuser> selecttbuser = userSetvice.selecttbuser();
        System.out.println("9003库");
        return selecttbuser;
    }
}