package day12.java3;

/**
 * @author capensis
 */
class Person {
	String name;
	int age;
	/** 身份证号 */
	int id = 1001;
	
	public Person(){
		System.out.println("我无处不在！");
	}
	
	public Person(String name){
		this.name = name;
	}
	
	public Person(String name,int age){
		this(name);
		this.age = age;
	}
	
	public void eat(){
		System.out.println("人：吃饭");
	}
	public void walk(){
		System.out.println("人：走路");
	}
}
