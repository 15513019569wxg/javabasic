package day07.exer;

import java.util.Arrays;

/**
 * @author capensis
 */
public class ArrayExer1 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        //记录总和
        int sum = Arrays.stream(arr).mapToInt(ints -> Arrays.stream(ints).sum()).sum();
        System.out.println("总和为：" + sum);
    }

}
