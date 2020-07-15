/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/12 下午8:26
 */
package data.structure.interview;

/**
 * 整数反转
 * 需要考虑反转后溢出问题
 * @author HanZhonghua
 * @version 1.0
 */
public class ReverseInt {

    public static void main(String[] args) {

    }

    public static int reverse(int a){
        int result = 0;
        while (a!=0) {
            int i = a % 10;
            a = a/10;

            result = result * 10 + i;
        }
        return result;
    }
}
