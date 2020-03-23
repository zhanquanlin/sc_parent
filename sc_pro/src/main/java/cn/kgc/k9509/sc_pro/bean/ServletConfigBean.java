package cn.kgc.k9509.sc_pro.bean;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname ServletConfigBean
 * @Description TODO
 * @Date 2020/3/19 20:52
 * @Created by Alina
 */
@Configuration
public class ServletConfigBean {
    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
        ServletRegistrationBean regist = new ServletRegistrationBean();
        regist.setServlet(new HystrixMetricsStreamServlet());
        regist.setName("hystrixMetricsStreamServlet");
        regist.setLoadOnStartup(1);
        regist.addUrlMappings("/hystrix.stream");
        return regist;
    }

}