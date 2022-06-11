package day07.java;

import java.util.Arrays;

/**
 * 快速排序		<p>
 * 通过一趟排序将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，<p>
 * 则分别对这两部分继续进行排序，直到整个序列有序。	<p>
 * @author shkstart
 * 2018-12-17
 */
public class QuickSort {

	/**
	 * 将两个位置的数字进行从小到达排序
	 * @param data	待排序的数组
	 * @param i	某个索引
	 * @param j	某个索引
	 */
	private static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	/**
	 * 快速排序
	 * @param data	待排序的数组
	 * @param start	开始索引 => 0
	 * @param end	结束索引 => data.length()-1
	 */
	private static void subSort(int[] data, int start, int end) {
		if (start < end) {
			// 基准值
			int base = data[start];
			// 左指针
			int left = start;
			// 右指针, 这里加1表示方便data[--right] 从最后一个元素开始
			int right = end + 1;
			while (true) {
				// 左指针往右走，寻找大于基准值的值，找到即停下来, 记下left
				while (true) {
					if (left >= end || data[++left] - base > 0) {
						break;
					}
				}
				// 右指针往左走，寻找小于基准值的值，找到即停下来, 记下right
				while (true) {
					if (right <= start || data[--right] - base < 0) {
						break;
					}
				}
				// 右指针走过的地方都比基准值大, 左指针走过的地方都比基准值小。
				if (left < right) {
					swap(data, left, right);
				} else {
					break;
				}
			}
			// 这里必须交换，因为data[right] < base, data[right+1] > base
			swap(data, start, right);
			//递归调用
			subSort(data, start, right - 1);
			subSort(data, right + 1, end);
		}
	}
	public static void quickSort(int[] data){
		subSort(data,0,data.length-1);
	}
	
	
	public static void main(String[] args) {
		int[] data = { 9, -16, 30, 23, -30, -49, 25, 21, 30, -16};
		System.out.println("排序之前：\n" + Arrays.toString(data));
		quickSort(data);
		System.out.println("排序之后：\n" + Arrays.toString(data));
	}
}
