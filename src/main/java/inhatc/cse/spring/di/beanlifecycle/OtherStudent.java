package inhatc.cse.spring.di.beanlifecycle;

public class OtherStudent  {

	private String name;
	private int age;
	
	public OtherStudent(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@PostConstuct
	public void initMethod() {
		System.out.println("initMethod()");
	}

	@PreDestroy
	public void destroyMethod() {
		System.out.println("destroyMethod()");
	}

}
