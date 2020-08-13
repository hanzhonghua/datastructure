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
        sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void sort(int[] arr){
        if (arr==null||arr.length<=0){
            return;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int  tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
}
