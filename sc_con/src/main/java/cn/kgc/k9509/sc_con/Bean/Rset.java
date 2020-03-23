package cn.kgc.k9509.sc_con.Bean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname Rset
 * @Description TODO
 * @Date 2020/3/12 15:56
 * @Created by Alina
 */
//@Configuration   //也就是把这个类当成了一个配置文件
//public class Rset {
//    @LoadBalanced  //开启ribbon，支持了负载均衡
//    @Bean
//    public RestTemplate getrestTemplate(){
//        return new RestTemplate();
//    }
//
//    //使用自定义的算法实现复杂均衡
//    @Bean
//    public IRule myirule(){
//        //return new RoundRobinRule();  //默认的，轮询
//        //return new RandomRule();  //随机算法
//        return new RetryRule();  //如果有一个服务宕机或者其他原因出问题了，我就自动的去访问健康的服务，如果没有意外，那么这个算法就是轮询
//    }
//}