package day06.java;
/**
 * 二维数组的使用：<p>
 * 	规定：二维数组分为外层数组的元素，内层数组的元素	<p>
 * 		int[][] arr = new int[4][3];	<p>
 * 		外层元素：arr[0],arr[1]等		<p>
 * 		内层元素：arr[0][0],arr[1][2]等		<p>
 * 
 *   ⑤ 数组元素的默认初始化值		<p>
 *   针对于初始化方式一：比如：int[][] arr = new int[4][3];	<p>
 *      外层元素的初始化值为：地址值	<p>
 *      内层元素的初始化值为：与一维数组初始化情况相同	<p>
 *      
 *   针对于初始化方式二：比如：int[][] arr = new int[4][];		<p>
 *   	外层元素的初始化值为：null		<p>
 *      内层元素的初始化值为：不能调用，否则报错。	<p>
 *
 *   ⑥ 数组的内存解析
 * @author capensis
 */
public class ArrayTest3 {
	public static void main(String[] args) {
		
		int[][] arr = new int[4][3];
		//[I@15db9742
		System.out.println(arr[0]);
		//0
		System.out.println(arr[0][0]);
		//[[I@6d06d69c
		System.out.println(arr);
		System.out.println("*****************");

		float[][] arr1 = new float[4][3];
		//地址值
		System.out.println(arr1[0]);
		//0.0
		System.out.println(arr1[0][0]);
		System.out.println("*****************");
		
		String[][] arr2 = new String[4][2];
		//地址值
		System.out.println(arr2[1]);
		//null
		System.out.println(arr2[1][1]);
		System.out.println("*****************");

		double[][] arr3 = new double[4][];
		//null
		System.out.println(arr3[1]);
		//报错
		//System.out.println(arr3[1][0]);
	}
}
