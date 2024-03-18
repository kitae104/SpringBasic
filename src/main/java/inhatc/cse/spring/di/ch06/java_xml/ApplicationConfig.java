package inhatc.cse.spring.di.ch06.java_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;

@Configuration
@ImportResource("classpath:ch06/applicationCTX3.xml")
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


