package inhatc.cse.spring.di.xmlbean3;

import inhatc.cse.spring.di.xmlbean2.Student;
import inhatc.cse.spring.di.xmlbean2.StudentInfo;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        String configLocation = "classpath:pencilBean.xml";   // xml 이름
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);

        Pencil pencil = ctx.getBean("pencil", Pencil.class);
        pencil.use();

        ctx.close();
    }
}
