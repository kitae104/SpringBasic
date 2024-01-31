package inhatc.cse.spring.di.java_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;

@Configuration
@ImportResource("classpath:java_xml/applicationCTX.xml")
public class ApplicationConfig {

    @Bean
    public Student student1() {
        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("영화");
        hobbys.add("독서");

        Student student = new Student("홍길동", 22, hobbys);
        student.setHeight(177);
        student.setWeight(77);

        return student;
    }
}


