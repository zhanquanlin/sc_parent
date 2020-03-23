package cn.kgc.k9509.feign.feignhy;

import cn.kgc.k9509.feign.Feigninterface;
import cn.kgc.k9509.pojo.Tbuser;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname FeignHy
 * @Description TODO
 * @Date 2020/3/20 17:12
 * @Created by Alina
 */
@Component
public class FeignHy implements FallbackFactory<Feigninterface> {
    public Feigninterface create(Throwable throwable) {
        return new Feigninterface() {
            public List<Tbuser> prolist() {
                List<Tbuser> list=new ArrayList<Tbuser>();
                Tbuser tbuser=new Tbuser();
                tbuser.setUsername("错误");
                list.add(tbuser);
                return list;
            }
        };
    }
}