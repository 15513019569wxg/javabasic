package day16.java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerArray;

import org.junit.Test;

/**
 * <pre>
 * 一、异常体系结构
 * java.lang.Throwable
 *     |-----java.lang.Error:一般不编写针对性的代码进行处理。
 *     |-----java.lang.Exception:可以进行异常的处理
 *         |------编译时异常(checked)
 *             |-----IOException
 *             	   |-----FileNotFoundException
 *             	   |-----EOFException
 *             	   |-----MalformedURLException
 *             	   |-----UnknownHostException
 *             |-----ClassNotFoundException
 *             |-----CloneNotSupportedException
 *         |------运行时异常(unchecked,RuntimeException)
 *             |-----NullPointerException
 *             |-----ArrayIndexOutOfBoundsException
 *             |-----ClassCastException
 *             |-----NumberFormatException
 *             |-----InputMismatchException
 *             |-----ArithmeticException
 * 面试题：常见的异常都有哪些？举例说明
 * @author capensis
 */
@SuppressWarnings("DuplicatedCode")
public class ExceptionTest {
	/** ******************以下是编译时异常*************************** */
	@Test
	public void test7() throws IOException {// 加入异常处理机制
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);
		int data = fis.read();
		while(data != -1){
			System.out.print((char)data);
			data = fis.read();
		}
		fis.close();
	}
	
	/** ******************以下是运行时异常*************************** */
	@Test
	public void test6(){
		int a = 10;
		int b = 0;
		//ArithmeticException
		System.out.println(a / b);
	}
	

	@Test
	public void test5(){
		Scanner scanner = new Scanner(System.in);
		//InputMismatchException
		int score = scanner.nextInt();
		System.out.println(score);
		scanner.close();
	}
	

	@Test
	public void test4(){
		String str = "123";
		str = "abc";
		//NumberFormatException
		int num = Integer.parseInt(str);
	}
	

	@Test
	public void test3(){
		Object obj = new Date();
		//ClassCastException
		String str = (String)obj;
	}
	
	/** IndexOutOfBoundsException */
	@Test
	public void test2(){
		//ArrayIndexOutOfBoundsException
		AtomicIntegerArray arr = new AtomicIntegerArray(new int[10]);
		System.out.println(arr.get(10));
		//StringIndexOutOfBoundsException
		String str = "abc";
		System.out.println(str.charAt(3));
	}
	

	@Test
	public void test1(){
		int[] arr = null;
		//NullPointerException
		System.out.println(arr[3]);
		String str = null;
		System.out.println(str.charAt(0));
	}
}
