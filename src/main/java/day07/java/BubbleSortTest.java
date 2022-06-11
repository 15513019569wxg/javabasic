package day07.java;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 数组的冒泡排序的实现
 *
 * @author capensis
 */
public class BubbleSortTest {
    public static void main(String[] args) {

        int[] arr = new int[]{43, 32, 76, -98, 0, 64, 33, -21, 32, 99};
        /*
         *  冒泡排序:
         *    本质是在每一轮比较总中，用不断交换得出的大值将下一个大值筛选出来。
         *    因此，每轮的结果后一部分是有序的。
         */

        IntStream.range(0, arr.length - 1).forEachOrdered(i -> {
            IntStream
                    .range(0, arr.length - 1 - i)
                    .filter(j -> arr[j] > arr[j + 1])
                    .forEach(j -> extracted(arr, j));
            System.out.println("第 " + i + " 轮的排序结果是: " + Arrays.toString(arr));
        });
        Arrays.stream(arr).mapToObj(j -> j + "\t").forEach(System.out::print);
    }

    /**
     * 将左右两个数字进行从小到大排序
     * @param arr 排序数组
     * @param j   某个索引
     */
    private static void extracted(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
}
