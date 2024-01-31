package inhatc.cse.spring.di.xmlbean4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        String configLocation1 = "classpath:xmlbean4/applicationCTX1.xml";
        String configLocation2 = "classpath:xmlbean4/applicationCTX2.xml";

        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1, configLocation2);

        Student student1 = ctx.getBean("student1", Student.class);
        System.out.println(student1.getName());
        System.out.println(student1.getHobbys());
    }
}
