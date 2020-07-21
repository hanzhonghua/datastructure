/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/9 下午10:21
 */
package data.structure.interview.array;

import java.util.Arrays;

/**
 * 合并两个有序数组，使结果仍然有序
 * @author HanZhonghua
 * @version 1.0
 */
public class MergeSortArray {

    public static void main(String[] args) {
        int a[] = {1,4,5,6};
        int b[] = {2,3,7,8};
        int[] result = getResult2(a, b);
        for (int i = 0; i<result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] getResult(int a[], int b[]) {
        int c[] = new int[a.length+b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        Arrays.sort(c);
        return c;
    }

    public static int[] getResult2(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        for (int m = 0; m < result.length; m++) {
            // 数组 a b 都没有遍历完毕
            if (i<a.length && j<b.length) {
                if (a[i]>b[j]) {
                    result[m]=b[j];
                    j++;
                } else {
                    result[m]=a[i];
                    i++;
                }
            // b 遍历完
            } else if (i<a.length) {
                result[m]=a[i];
                i++;
            // a 遍历完
            } else if (j<b.length){
                result[m]=b[j];
                j++;
            }
        }
        return result;
    }
}
