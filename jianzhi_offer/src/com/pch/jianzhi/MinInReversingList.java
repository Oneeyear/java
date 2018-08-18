package com.pch.jianzhi;

/**
 * 旋转数组的最小数字
 * 题目描述：
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1;
 * @return 
 */
public class MinInReversingList {
	public static void main(String[] args) {
		int[] a = {9,10,11,12,13,2,3,4,5,6};
		min(a);
	}

	private static void min(int[] a) {
		int min = a[0];
		if(a != null || a.length > 0) {
			for(int i = 0; i < a.length - 1; i++) {
				if(a[i] < min ) {
					min = a[i];
					System.out.println("最小值为" + a[i]);
					break;
				} 
			}
		}
	}
	
	
	
	
}
