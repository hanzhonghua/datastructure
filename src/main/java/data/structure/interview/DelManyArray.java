/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/12 下午5:59
 */
package data.structure.interview;

/**
 * 给定一个排序数组，删除重复的，并返回新数组长度
 * 比如[0,1,2,3,3,5,6,6] 需要结果[0,1,2,3,5,6]
 *
 * 利用双指针方式，如下，发现arr[i] !=arr[j]时，在往数组中写入
 * @author HanZhonghua
 * @version 1.0
 */
public class DelManyArray {

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,3,5,6,6};
        System.out.println(del(arr));
    }

    public static int del(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;

    }
}
