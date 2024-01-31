package inhatc.cse.spring.di.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class ApplicationConfig {

    @Bean
    public Student student1(){
        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("수영");
        hobbys.add("요리");

        Student student = new Student("홍길동", 20, hobbys);
        student.setHeight(180);
        student.setWeight(80);

        return student;
    }

    @Bean
    public Student student2(){
        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("독서");
        hobbys.add("음악감상");

        Student student = new Student("임꺽정", 18, hobbys);
        student.setHeight(170);
        student.setWeight(72);

        return student;
    }
}
