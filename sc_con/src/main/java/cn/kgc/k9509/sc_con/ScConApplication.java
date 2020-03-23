package cn.kgc.k9509.sc_con;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient   //启动eurekas客户端
@EnableFeignClients(basePackages = "cn.kgc.k9509.feign")
@ComponentScan(basePackages = {"cn.kgc.k9509.feign.feignhy"})
@ComponentScan(basePackages = {"cn.kgc.k9509.sc_con.controller"})
@EnableHystrix   //开启断路器
@EnableHystrixDashboard //开启断路器的监听器
public class ScConApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScConApplication.class, args);
    }

}
