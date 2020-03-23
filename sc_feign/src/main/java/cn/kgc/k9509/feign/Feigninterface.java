package cn.kgc.k9509.feign;

import cn.kgc.k9509.feign.feignhy.FeignHy;
import cn.kgc.k9509.pojo.Tbuser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Classname Feigninterface
 * @Description TODO
 * @Date 2020/3/20 16:45
 * @Created by Alina
 */
@FeignClient(value = "EUREKA-PROVIDER",fallbackFactory = FeignHy.class)
public interface Feigninterface {
    @RequestMapping(value = "/prolist",produces = "application/json;charset=utf-8")
    List<Tbuser> prolist();
}
