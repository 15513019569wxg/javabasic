package day13.java1;

/**
 * @author capensis
 */
public class Customer {
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Customer() {
		super();
	}
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/** 自动生成的equals() */
	@Override
	public boolean equals(Object obj) {
		// 同一个对象
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		// 类型兼容
		if (getClass() != obj.getClass()) {
			return false;
		}
		Customer other = (Customer) obj;
		if (age != other.age) {
			return false;
		}
		if (name == null) {
			return other.name == null;
		} else {
			return name.equals(other.name);
		}
	}
	

	/** 自动实现 */
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
}
