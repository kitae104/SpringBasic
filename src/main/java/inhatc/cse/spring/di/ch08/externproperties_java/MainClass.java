package inhatc.cse.spring.di.ch08.externproperties_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        AdminConnection connection = ctx.getBean("adminConfig", AdminConnection.class);

        System.out.println("adminId: " + connection.getAdminId());
        System.out.println("adminPw: " + connection.getAdminPw());
        System.out.println("sub_adminId: " + connection.getSub_adminId());
        System.out.println("sub_adminPw: " + connection.getSub_adminPw());

        ctx.close();
    }
}
