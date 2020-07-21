/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/15 下午6:18
 */
package data.structure.interview.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 数字转中文
 * 比如给定12345 转成 一万二千三百四十五
 * @author HanZhonghua
 * @version 1.0
 */
public class NumToChina {

    public static void main(String[] args) {

        System.out.println(cule(23456, getRes(), getRes2()));
       Map<Integer, Integer> map =  new HashMap<>();
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        iterator.next();

    }

    public static String cule(int req, Map<Integer, String> m1, Map<Integer, String> m2){


        String str = String.valueOf(req);
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            int numericValue = Character.getNumericValue(aChar);
            String s = m1.get(numericValue);
            sb.append(s);
            String s1 = m2.get(length);
            sb.append(s1);
            length--;
        }


        return sb.toString();
    }

    public static Map<Integer, String> getRes(){
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "零");
        map.put(1, "一");
        map.put(2, "二");
        map.put(3, "三");
        map.put(4, "四");
        map.put(5, "五");
        map.put(6, "六");
        map.put(7, "七");
        map.put(8, "八");
        map.put(9, "九");
        return map;
    }

    public static Map<Integer, String> getRes2(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "");
        map.put(2, "十");
        map.put(3, "百");
        map.put(4, "千");
        map.put(5, "万");
        map.put(6, "十万");
        map.put(7, "百万");
        map.put(8, "千万");
        map.put(9, "亿");
        return map;
    }
}
