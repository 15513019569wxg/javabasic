package day09.java;

import java.util.Arrays;

/**
 * @author capensis
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        System.out.println("=============================   测试最大值   ================================");
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32, 34, 32, 5, 3, 54, 654, -98, 0, -53, 5};
        int max = util.getMax(arr);
        System.out.println("最大值为：" + max);

        System.out.println("=============================   测试冒泡排序  ===============================");
        System.out.println("排序前：");
        util.print(arr);
        util.sort(arr);
        System.out.println("排序后：");
        util.print(arr);

		System.out.println("=============================    查找:     ==================================");
		int index = util.getIndex(arr, 0);
		if(index >= 0){
			System.out.println("找到了，索引地址为：" + index);
		}else{
			System.out.println("未找到");
		}

        System.out.println("=============================   测试反转数组  ================================");
		util.reverse(arr);
		Arrays.stream(arr).mapToObj(j -> j + "\t").forEach(System.out::print);
    }
}
