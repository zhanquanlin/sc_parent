package cn.kgc.k9509.ribbonalgorithm;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname MyRibbon
 * @Description TODO
 * @Date 2020/3/16 15:45
 * @Created by Alina
 */
//@Configuration  //也就是把这个类当成了一个配置文件
//public class MyRibbon {
//    @Bean
//    public IRule myirule(){
//        return new Ribbon_zy();  //自定义算法(自己编写的算法)
//    }
//}