/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/9 下午11:25
 */
package data.structure.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组中两数之和=目标数
 * @author HanZhonghua
 * @version 1.0
 */
public class AddTarget {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int[] ints = get(a, 8);
        for (int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }
    }

    public static int[] get(int a[], int traget) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<a.length;i++) {
            int j = traget - a[i];
            if (map.containsKey(j)) {
                return new int[]{map.get(j), i};
            }
            map.put(a[i], i);
        }
        return null;
    }
}
