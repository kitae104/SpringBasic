package inhatc.cse.spring.di.ch08.properties_xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:ch08/properties.xml");

        AdminConnection adminConnection = ctx.getBean("adminConnection", AdminConnection.class);
        System.out.println("adminId: " + adminConnection.getAdminId());
        System.out.println("adminPw: " + adminConnection.getAdminPw());
        System.out.println("sub_adminId: " + adminConnection.getSub_adminId());
        System.out.println("sub_adminPw: " + adminConnection.getSub_adminPw());
    }
}
