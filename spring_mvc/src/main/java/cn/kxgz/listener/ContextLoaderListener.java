package cn.kxgz.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //将spring的应用上下文对象存储岛ServletContext域中
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("app", servletContext);
        System.out.println("servletContext 容器创建完毕！");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
