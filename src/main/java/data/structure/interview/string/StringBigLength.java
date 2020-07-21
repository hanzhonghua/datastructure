/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/9 上午8:12
 */
package data.structure.interview.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 求一个字符串中最大的连续不重复的字符长度
 *
 * 经典的滑动窗口应用场景
 * 其实就是一个队列，以abcadsdf为例，abc进入队列时，满足条件不重复，当a在进入队列时已经出现重复了，移动这个队列
 *
 * 实现：
 * 1.定义一个Map，存在字符串的单个元素以及元素位置+1，+1表示往后移一位为不重复
 * 2.记录不重复子串的开始下表start与结束下标end
 * 3.随着不断遍历，会遇到start end间字符相同的情况，此时字符作为key，获取其value，更新start
 * @author HanZhonghua
 * @version 1.0
 */
public class StringBigLength {

    public static void main(String[] args) {

        int bigLength = getBigLength("abcadsdfadfghjkl");
        System.out.println(bigLength);
    }

    public static int getBigLength(String s) {

        if (s==null||s.length()==0) {
            return 0;
        }
        int start=0;
        int max=0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                start = Math.max(start, map.get(c));
            }
            max = Math.max(max, i-start+1);
            map.put(c, i+1);
        }

       return max;
    }
}
