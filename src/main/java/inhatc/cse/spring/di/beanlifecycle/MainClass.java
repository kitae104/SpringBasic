package inhatc.cse.spring.di.beanlifecycle;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

		ctx.load("classpath:beanlifecycle/applicationCTX.xml");
		
		ctx.refresh();

		Student student = ctx.getBean("student", Student.class);
		System.out.println(student.getName());

		OtherStudent otherStudent = ctx.getBean("otherStudent", OtherStudent.class);
		System.out.println(otherStudent.getName());
		
		ctx.close();
		
	}
	
}
