package cn.kgc.k9509.sc_zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableEurekaClient  //启动eureka客户端
//启动Zuul
@EnableZuulProxy
public class ScZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScZuulApplication.class, args);
    }

}
