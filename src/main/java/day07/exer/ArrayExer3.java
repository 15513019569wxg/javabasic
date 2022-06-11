package day07.exer;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 使用简单数组   <p>
 * 拓展：修改题目，实现array2对array1数组的复制
 *
 * @author capensis
 */
public class ArrayExer3 {
    public static void main(String[] args) {  //alt + /
        int[] array1, array2;

        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};

        //显示array1的内容
        Arrays.stream(array1).mapToObj(j -> j + "\t").forEachOrdered(System.out::print);

        //数组的复制:
        array2 = new int[array1.length];
        System.arraycopy(array1, 0, array2, 0, array2.length);

        //修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)
        IntStream.range(0, array2.length).filter(i -> i % 2 == 0).forEach(i -> array2[i] = i);
        System.out.println();
        //打印出array1
        Arrays.stream(array1).mapToObj(j -> j + "\t").forEach(System.out::println);
        Arrays.stream(array2).mapToObj(i -> i + "\t").forEach(System.out::print);
    }
}
