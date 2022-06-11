package day13.exer;

/**
 * <pre>
 *建立InstanceTest 类，在类中定义方法method(Person e);
     在method中:
     (1)根据e的类型调用相应类的getInfo()方法。
     (2)根据e的类型执行：
     如果e为Person类的对象，输出：
     “a person”;
     如果e为Student类的对象，输出：
     “a student”
     “a person ”
     如果e为Graduate类的对象，输出：
     “a graduated student”
     “a student”
     “a person”
 * @author capensis
 */
public class InstanceTest {
	
	public static void main(String[] args) {
		InstanceTest test = new InstanceTest();
		test.method(new Student());
	}
	
	
	public void method(Person e){
		//虚拟方法调用
		String info = e.getInfo();
		System.out.println(info);
		if(e instanceof Graduate){
			System.out.println("a graduated student");
		}
		if(e instanceof Student){
			System.out.println("a student");
		}
		if(e instanceof Person){
			System.out.println("a person");
		}
		
		
	}
}

class Person {
	protected String name = "person";
	protected int age = 50;
	public String getInfo() {
		return "Name: " + name + "\n" + "age: " + age;
	}
}

class Student extends Person {
	protected String school = "pku";
	@Override
	public String getInfo() {
		return "Name: " + name + "age: " + age + "school: " + school;
	}
}

class Graduate extends Student {
	public String major = "IT";

	@Override
	public String getInfo() {
		return "Name: " + name + "\nage: " + age + "\nschool: " + school + "\nmajor:" + major;
	}
}
