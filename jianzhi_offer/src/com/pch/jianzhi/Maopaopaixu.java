package com.pch.jianzhi;

/**
 * 冒泡排序
 * 每一趟从未排序的记录中对比选出最大值，每次选出的最大值都置于未排序序列的最后，直至排序完成。
 */
public class Maopaopaixu {

	public static void main(String[] args) {
		
		int[] arr = {6,3,8,2,9,1};
		int max;
		for(int j = 0; j < arr.length-1; j++) {
			for(int i = 0; i < arr.length-1; i++) {
				if(arr[i] > arr[i+1]) {
					max = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = max;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
		
	}
}
