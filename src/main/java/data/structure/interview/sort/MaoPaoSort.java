/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/17 下午6:35
 */
package data.structure.interview.sort;

/**
 * 冒泡排序
 * @author HanZhonghua
 * @version 1.0
 */
public class MaoPaoSort {

    public static void main(String[] args) {

        int[] arr  = {1,4,3,2,7,6,5};
        int[] sort = sort(arr);
        for (int i=0;i<sort.length;i++){
            System.out.print(sort[i]);
        }
    }

    public static int[] sort(int[] arr){
        if (arr==null||arr.length<=0){
            return new int[0];
        }
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                if (arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
