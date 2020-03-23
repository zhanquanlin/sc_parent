package cn.kgc.k9509.sc_pro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient  //启动eureka客户端
@MapperScan("cn.kgc.k9509.mapper")
@EnableHystrix   //开启断路器
@EnableHystrixDashboard //开启断路器的监听器
public class ScProApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScProApplication.class, args);
    }

}
