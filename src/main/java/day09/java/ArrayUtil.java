package day09.java;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * 自定义数组的工具类
 *
 * @author capensis
 */
class ArrayUtil {
    /**
     * 求数组的最大值
     */
    public int getMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    /**
     * 求数组的最小值
     */
    public int getMin(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    /**
     * 求数组的总和
     */
    public int getSum(int[] arr) {
        AtomicInteger sum = new AtomicInteger(Arrays.stream(arr).sum());
        return sum.get();
    }

    /**
     * 求数组的平均值
     */
    public int getAvg(int[] arr) {
        return getSum(arr) / arr.length;
    }

    /**
     * 如下的两个同名方法构成了重载 反转数组
     */
    public void reverse(int[] arr) {
        IntStream
                .range(0, arr.length / 2)
                .forEach(i -> {
                    int temp = arr[i];
                    arr[i] = arr[arr.length - i - 1];
                    arr[arr.length - i - 1] = temp;
                });
    }

    public void reverse(String[] arr) {
    }

    /**
     * 复制数组
     */
    public int[] copy(int[] arr) {
        int[] arr1 = new int[arr.length];
        System.arraycopy(arr, 0, arr1, 0, arr1.length);
        return arr1;
    }

    /**
     * 数组排序
     */
    public void sort(int[] arr) {
        //正确的：
        IntStream
                .range(0, arr.length - 1)
                .flatMap(i -> IntStream.range(0, arr.length - 1 - i))
                .filter(j -> arr[j] > arr[j + 1]).
                forEach(j -> swap(arr, j, j + 1));
    }

    /*
        错误的：交换数组中指定两个位置元素的值
            public void swap(int i,int j){
                int temp = i;
                i = j;
                j = temp;
            }
*/

    /**
     * 正确的：交换数组中指定两个位置元素的值
     */
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    /**
     * 遍历数组
     */
    public void print(int[] arr) {
        Arrays.stream(arr).mapToObj(j -> j + "\t").forEach(System.out::print);
        System.out.println();
    }

    /**
     * 查找第一次出现的指定元素
     */
    public int getIndex(int[] arr, int dest) {
        // 线性查找：
        return IntStream.range(0, arr.length).filter(i -> dest == arr[i]).findFirst().orElse(-1);
    }

}
