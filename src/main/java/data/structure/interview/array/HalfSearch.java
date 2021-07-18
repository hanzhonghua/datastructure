/**
 * Copyright (c) 2021 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2021/7/18 下午6:11
 */
package data.structure.interview.array;

/**
 * 折半查找，假设一升序数组，不重复，查询给定元素下标，没有返回-1
 *
 * @author HanZhonghua
 * @version 1.0
 */
public class HalfSearch {


    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,7,8,9,12};

        int i = halfSearch(a, 12);
        System.out.println(i);
    }

    public static int halfSearch(int[] array, int x) {

        // 判空条件很重要
        if (array == null) {
            return -1;
        }

        // 记录最开始的元素下标
        int left = 0;

        // 记录最大的元素下标
        int right = array.length - 1;

        // 查找的下标
        int target = 0;

        // 左右碰撞之前
        while (left <= right) {
            // 不直接使用(right+left)/2，为了防止溢出，每次折一半
            target = left + (right - left) / 2;

            if (array[target] == x) {
                return target;
            }

            // 目标值小于折半下标对应元素，right-1
            if (x < array[target]) {
                right = target - 1;
            } else {
                left = target + 1;
            }
        }
        return -1;

    }
}


