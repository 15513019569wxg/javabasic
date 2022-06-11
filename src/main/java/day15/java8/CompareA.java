package day15.java8;

/**
 * JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法
 * @author capensis
 */
public interface CompareA {
	/** 静态方法 */
	static void method1(){
		System.out.println("CompareA:北京");
	}
	/** 默认方法 */
	default void method2(){
		System.out.println("CompareA：上海");
	}

	/**
	 * 默认方法
	 */
	default void method3(){
		System.out.println("CompareA：上海");
	}
}
