package inhatc.cse.spring.di.xmlbean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        /*
        MyCalculator myCalculator = new MyCalculator();
        myCalculator.setCalculator(new Calculator());       // 직접 객체 생성
        myCalculator.setFirstNum(10);
        myCalculator.setSecondNum(2);
        */

        // 외부에서 XML로 Bean을 생성해서 주입(DI)
        String configLocation = "applicationCTX.xml";   // xml 이름
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
        MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);

        myCalculator.add();
        myCalculator.sub();
        myCalculator.mul();
        myCalculator.div();
    }
}
