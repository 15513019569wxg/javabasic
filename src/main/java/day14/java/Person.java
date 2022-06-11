package day14.java;

/**
 * @author capensis
 */
class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("人：吃饭");
	}

	public void walk() {
		System.out.println("人：走路");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person) obj;
		if (age != other.age) {
			return false;
		}
		if (name == null) {
			return other.name == null;
		} else {
			return name.equals(other.name);
		}
	}

}
