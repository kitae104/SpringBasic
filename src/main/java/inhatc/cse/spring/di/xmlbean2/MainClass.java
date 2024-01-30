package inhatc.cse.spring.di.xmlbean2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        String configLocation = "classpath:studentInfo.xml";   // xml 이름
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);

        StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
        Student student1 = ctx.getBean("student1", Student.class);
        Student student2 = ctx.getBean("student2", Student.class);
        studentInfo.setStudent(student2);
        studentInfo.getStudentInfo();

    }
}

