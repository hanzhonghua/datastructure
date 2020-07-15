/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/12 下午5:36
 */
package data.structure.interview;

/**
 * [
 *   [1,2,8,9]，
 *   [2,4,9,12]，
 *   [4,7,10,13]，
 *   [6,8,11,15]
 * ]
 * 二维数组中查询，如上二维数组，给定一个数字判断是否在二维数组中，比如给6返回false，给5返回fasle
 * @author HanZhonghua
 * @version 1.0
 */
public class TowArrayFind {

    public static void main(String[] args) {
        int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(baoLi(arr,5));
    }

    /**
     * 暴利解法，直接双重for，时间复杂度O(n平方)
     * @param arr
     * @param n
     * @return
     */
    public static boolean baoLi(int[][] arr, int n) {
        if (arr.length == 0) {
            return false;
        }
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]==n){
                    return true;
                }
            }
        }
        return false;
    }
}
