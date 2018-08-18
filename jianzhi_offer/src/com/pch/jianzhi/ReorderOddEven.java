package com.pch.jianzhi;

/**
 * 问题描述：
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有奇数位与数组的前半部分，所有偶数位与数组的后半部分
 */
public class ReorderOddEven {
	public static void main(String[] args) throws Exception {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int[] b = reorderOddEven(a);
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ",");
		}
	}

	private static int[] reorderOddEven(int[] a) throws Exception {
		int[] b = new int[a.length];
		int fir = 0;
		int end = 0;
		if(a == null || a.length == 0) {
			throw new Exception("数组的长度不能为空");
		} else {
			for(int i = 0; i < a.length; i++) {
				if(i % 2 == 0) {
					b[fir] = a[i];
					fir ++ ;
				} else {
					b[b.length-1-end] = a[i];
					end ++;
				}
			}
		}
		return b;
	}
}
