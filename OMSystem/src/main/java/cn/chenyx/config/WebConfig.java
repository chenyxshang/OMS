package cn.chenyx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    private final String[] notLoginInterceptPaths = {"/layui/**",
            "/scripts/**", "/js/**",
            "/Files/**", "/Images/**"};

    /**
     * 添加拦截器 拦截除了static
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationInterceptor()).addPathPatterns("/**")
                .excludePathPatterns(notLoginInterceptPaths);
    }

    @Bean
    public SecurityInterceptor authenticationInterceptor() {
        return new SecurityInterceptor();
    }
}
