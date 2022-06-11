package day07.java;

import java.util.stream.IntStream;

/**
 * 数组中的常见异常：<p>
 * 1. 数组角标越界的异常：ArrayIndexOutOfBoundsException	<p>
 * 2. 空指针异常：NullPointerException
 * @author capensis
 */
@SuppressWarnings("AlibabaRemoveCommentedCode")
public class ArrayExceptionTest {
	public static void main(String[] args) {
		
		//1. 数组角标越界的异常：ArrayIndexOutOfBoundsException
		int[] arr = new int[]{1,2,3,4,5};

		IntStream.rangeClosed(0, arr.length).map(i -> arr[i]).forEach(System.out::println);
		//System.out.println(arr[-2]);

		System.out.println("====================================================");
		
		//2.2. 空指针异常：NullPointerException
		//情况一：
//		int[] arr1 = new int[]{1,2,3};
//		arr1 = null;
//		System.out.println(arr1[0]);
		
		//情况二：
//		int[][] arr2 = new int[4][];
//		System.out.println(arr2[0][0]);
		
		//情况三：
		String[] arr3 = new String[]{"AA","BB","CC"};
		arr3[0] = null;
		System.out.println(arr3[0]);
	}
}
