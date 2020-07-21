/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/14 上午8:15
 */
package data.structure.interview.search;

/**
 * 给定一个有序数组和一个数字，查询该数字在数组哪个下标位置，不存在返回-1
 *
 * 折半查询
 * @author HanZhonghua
 * @version 1.0
 */
public class BinarySerach {

    public static void main(String[] args) {

        int[] arr = {1,3,4,5,6,7,9};
        int a=9;
        System.out.println(get(arr,a));
    }

    public static int get(int[] arr, int a){
        if(arr==null||arr.length==0){
            return -1;
        }
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==a){
                return mid;
            }else if(arr[mid]<a){
                left=mid+1;
            }else if(arr[mid]>a){
                right=mid-1;
            }
        }
        return -1;
    }
}
