package data.structure.sort;

/**
 * 冒泡排序
 * 
 */
public class BubbleSort {

	public static void bubbleSort(int[] a){
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i] < a[j]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {4,1,3,8,6,7};
		bubbleSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
