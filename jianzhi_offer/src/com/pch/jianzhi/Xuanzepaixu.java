package com.pch.jianzhi;

/**
 * 选择排序
 * 每一趟从待排序的记录中选出最小的元素，将其放在已排好的序列末尾，直到全部记录完毕。
 */
public class Xuanzepaixu {

	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 5, 2, 8, 15, 0, 6 };

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length - 1; i++) {
			int k = i;
			for (int j = k + 1; j < arr.length; j++) {
				// 判断出最小值的位置
				if (arr[j] < arr[k]) {	
					k = j;
				}
			}
			// 如果k不等于i，则将第k位的值与第i位的值互换
			if (k != i) {	
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
