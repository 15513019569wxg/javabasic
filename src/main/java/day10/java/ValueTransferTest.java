package day10.java;

/**
 * @author capensis
 */
public class ValueTransferTest {
	public static void main(String[] args) {
		String s1 = "hello";
		
		ValueTransferTest test = new ValueTransferTest();
		test.change(s1);
		
		/* hi~~ */
		System.out.println("s1的值：" + s1);
		
		
	}
	
	public void change(String s){
		s = "hi~~";
		System.out.println("s的值：" + s);
	}
}
