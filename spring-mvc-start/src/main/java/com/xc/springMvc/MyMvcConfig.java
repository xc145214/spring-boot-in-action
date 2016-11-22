package com.xc.springMvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

/**
 * Created by Administrator on 2016/11/20.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.xc.springMvc")
public class MyMvcConfig  extends WebMvcConfigurerAdapter{

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new
                InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return  viewResolver;
    }

    /**
     * 配置静态资源。
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
      registry.addResourceHandler("/assets/**")//对外访问地址
              .addResourceLocations("classpath:/assets/");//文件目录
    }


    @Bean
    public DemoInterceptor demoInterceptor(){
        return new DemoInterceptor();
    }

    /**
     * 拦截器配置。
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(demoInterceptor());
    }


    /**
     * 快捷配置 view.
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/upload").setViewName("/upload");
        registry.addViewController("/converter").setViewName("/converter");
        registry.addViewController("/sse").setViewName("/sse");
        registry.addViewController("/async").setViewName("/async");
    }

    /**
     * 忽略点参数。
     * @param configurer
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseRegisteredSuffixPatternMatch(false);
    }

    /**
     * 文件配置。
     * @return
     */
    @Bean
    public MultipartResolver multipartResolver(){
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(1000000);
        return multipartResolver;
    }

    @Bean
    public MyMessageConverter converter(){
        return new MyMessageConverter();
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(converter());
    }
}
