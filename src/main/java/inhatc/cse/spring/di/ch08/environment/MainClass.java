package inhatc.cse.spring.di.ch08.environment;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
        ConfigurableEnvironment env = ctx.getEnvironment();
        MutablePropertySources propertySources = env.getPropertySources();

        try {
            propertySources.addLast(new ResourcePropertySource("classpath:ch08/admin.properties"));
            System.out.println(env.getProperty("admin.id"));
            System.out.println(env.getProperty("admin.pw"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext) ctx;
        gCtx.load("classpath:ch08/environment.xml");
        gCtx.refresh();

        AdminConnection adminConnection = gCtx.getBean("adminConnection", AdminConnection.class);
        System.out.println("adminId: " + adminConnection.getAdminId());
        System.out.println("adminPw: " + adminConnection.getAdminPw());

        gCtx.close();
        ctx.close();
    }
}
