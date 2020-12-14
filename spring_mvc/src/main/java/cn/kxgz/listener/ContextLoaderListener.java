package cn.kxgz.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();

        //读取web.xml配置的全局参数
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app = new ClassPathXmlApplicationContext(servletContext.getInitParameter("contextConfigLocation"));
        //将spring的应用上下文对象存储岛ServletContext域中
        servletContext.setAttribute("app", app);
        System.out.println("servletContext 容器创建完毕！");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
