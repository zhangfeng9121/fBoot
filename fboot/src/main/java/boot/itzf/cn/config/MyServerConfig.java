package boot.itzf.cn.config;

import boot.itzf.cn.filter.MyFilter;
import boot.itzf.cn.listener.MyListener;
import boot.itzf.cn.servelet.MyServelet;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @AUTHOR ZF
 * @DATE 2019/7/3
 */
@Configuration
public class MyServerConfig {

    // 配置过滤器
    @Bean
    public ServletListenerRegistrationBean<MyListener> servletListenerRegistrationBean() {
        ServletListenerRegistrationBean<MyListener> myListenerServletListenerRegistrationBean = new ServletListenerRegistrationBean<>(new MyListener());
        myListenerServletListenerRegistrationBean.setOrder(2);
        return myListenerServletListenerRegistrationBean;
    }

    // 注册servelet
    @Bean
    public ServletRegistrationBean<MyServelet> serveletServletRegistrationBean() {
        return new ServletRegistrationBean<>(new MyServelet(),"/myServlet");
    }

    // 配饰filter
    @Bean
    public FilterRegistrationBean<MyFilter> filterRegistrationBean() {
        FilterRegistrationBean<MyFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new MyFilter());
        filterFilterRegistrationBean.addUrlPatterns("/myFilter");
        return filterFilterRegistrationBean;
    }

    // 配置嵌入式servlet容器
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                factory.setPort(8090);
            }
        };
    }
}
