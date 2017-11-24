package data.structure.sort;

/**
 * 选择排序
 * 经过一次比较后得到最小数据，然后将此数据与第一个数据交换，接着对不包含第一个记录以外
 * 的其他数据进行第二轮比较，得到最小并保存到第二个位置，重复知道比较记录只有一个为止
 * 以数据[45,57,13,68,22]为例
 * 第一次 13,[45,57,68,22]
 * 第二次13,22,[45,57,68]
 * 第三次13,22,45,[57,68]
 * 第四次13,22,45,57,[68]
 * 得到最终结果13,22,45,57,68
 * 
 * 时间复杂度O(n平方)，稳定的排序
 */
public class SelectSort {
	
	public static void selectSort(int[] a){
		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			for (int j = i; j < a.length; j++) {
				if(a[j] < a[i]){
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
	
		int[] a = {5,4,7,8,1,6};
		selectSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
