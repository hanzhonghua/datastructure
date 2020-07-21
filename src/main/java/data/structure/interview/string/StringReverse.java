/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/17 下午6:48
 */
package data.structure.interview.string;

import java.util.Arrays;

/**
 * 字符串反转
 * @author HanZhonghua
 * @version 1.0
 */
public class StringReverse {

    public static void main(String[] args) {

        String str = "abcdefgh";
        char[] chars = str.toCharArray();

        reveser(chars, 0, chars.length-1);
        System.out.println(Arrays.toString(chars));

        /*StringBuilder sb = new StringBuilder();
        for (int i=chars.length-1; i>=0; i--){
            sb.append(chars[i]);
        }
        System.out.println(sb.toString());*/
    }

    public static void reveser(char[] chars, int left, int right) {
        if (left >= right) {
            return;
        }
        while (left < right) {
            char c = chars[left];
            chars[left] = chars[right];
            left++;
            chars[right] = c;
            right--;
        }
    }
}
