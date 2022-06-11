package day06.exer;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author capensis
 */
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = new int[] { 8, 2, 1, 0, 3 };
		int[] index = new int[] { 2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3 };
		String tel = Arrays.stream(index).mapToObj(j -> String.valueOf(arr[j])).collect(Collectors.joining());
		//18...
		System.out.println("联系方式：" + tel);
	}

}
