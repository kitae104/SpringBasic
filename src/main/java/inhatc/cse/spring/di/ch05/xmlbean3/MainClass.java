package inhatc.cse.spring.di.ch05.xmlbean3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        String configLocation = "classpath:ch05/pencilBean.xml";   // xml 이름
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);

        Pencil pencil = ctx.getBean("pencil", Pencil.class);
        pencil.use();

        ctx.close();
    }
}
