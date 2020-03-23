package cn.kgc.k9509.sc_pro.controller;

import cn.kgc.k9509.pojo.Tbuser;
import cn.kgc.k9509.service.UserSetvice;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Usercontroller
 * @Description TODO
 * @Date 2020/3/12 16:03
 * @Created by Alina
 */
@RestController
public class Usercontroller {
    @Autowired
    UserSetvice userSetvice;

    @HystrixCommand(fallbackMethod = "errer" )
    @RequestMapping("/prolist")
    public List<Tbuser> prolist(){
        List<Tbuser> selecttbuser = userSetvice.selecttbuser();
        System.out.println("9001库");
        return selecttbuser;
    }


    public List<Tbuser> errer(){
        Tbuser tbuser=new Tbuser();
        tbuser.setUsername("错误");
        List<Tbuser> list=new ArrayList<>();
        list.add(tbuser);
        return list;
    }
}