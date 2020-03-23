package cn.kgc.k9059.sc_hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard  //启动HystrixDashboard
public class ScHystrixdashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScHystrixdashboardApplication.class, args);
    }

}
