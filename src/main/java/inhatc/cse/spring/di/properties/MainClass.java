package inhatc.cse.spring.di.properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        String configLocation = "propertiesBean.xml";   // xml 이름
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);  // 스프링 컨테이너 생성
        MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);        // 스프링 컨테이너에서 빈 객체(컴포넌트) 가져오기
        myInfo.getInfo();
        ctx.close();
    }
}
