package day14.java3;

class Father {
	static {
		System.out.println("11111111111");
	}
	{
		System.out.println("22222222222");
	}

	public Father() {
		System.out.println("33333333333");
	}

}

/**
 * @author capensis
 */
public class Son extends Father {
	static {
		System.out.println("44444444444");
	}
	// 非静态代码块优先于构造器执行
	{
		System.out.println("55555555555");
	}
	public Son() {
		System.out.println("66666666666");
	}

	/** 由父及子 静态先行 */
	public static void main(String[] args) {
		System.out.println("77777777777");
		System.out.println("************************");
		// 先执行父类的非static()和构造器
		new Son();
		System.out.println("************************");
		new Son();
		System.out.println("************************");
		new Father();
	}

}
