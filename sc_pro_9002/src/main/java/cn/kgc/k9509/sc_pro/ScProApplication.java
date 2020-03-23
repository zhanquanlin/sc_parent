package cn.kgc.k9509.sc_pro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //启动eureka客户端
@MapperScan("cn.kgc.k9509.mapper")
public class ScProApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScProApplication.class, args);
    }

}
