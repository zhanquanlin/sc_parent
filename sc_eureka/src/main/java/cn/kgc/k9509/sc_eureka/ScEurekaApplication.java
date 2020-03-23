package cn.kgc.k9509.sc_eureka;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer   //启动Eureka服务端
public class ScEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScEurekaApplication.class, args);
    }
}
