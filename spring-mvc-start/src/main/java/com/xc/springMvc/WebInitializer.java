package com.xc.springMvc;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by Administrator on 2016/11/20.
 */
public class WebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new
                AnnotationConfigWebApplicationContext();
        /**注册配置*/
        ctx.register(MyMvcConfig.class);
        /** 关联ServletContext*/
        ctx.setServletContext(servletContext);

        /** 注册Spring MVC 的 DispatcherServlet*/
       ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher",new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
       /** 支持异步 */
        servlet.setAsyncSupported(true);

    }
}
