package cn.kgc.k9509.sc_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ScConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScConfigApplication.class, args);
    }

}
