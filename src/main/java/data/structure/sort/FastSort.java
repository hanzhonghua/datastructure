package data.structure.sort;

/**
 * 快速排序
 * 不稳定，选择一个基准元素，通常选择第一个元素或最后一个元素，通过一趟扫描，将待排序列分为两部分
 * 一部分比基准元素小，一部分比基准元素大或等，此时基准元素在其排好序之后的位置，然后在用同样的方法
 * 递归的排序划分的两部分
 */

public class FastSort {
	
	public static void quickSort(int[] a,int low, int high){
		if(low<high){
			
		}
	}
	
	private static int getMiddle(int[] a,int low, int high){
		int temp = a[low]; // 基准元素
		while(low<high){
			// 找到比基准元素小的位置
			while(low<high && a[high]>temp){
				high--;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println();
	}
}
