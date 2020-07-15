/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/15 上午10:25
 */
package data.structure.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HanZhonghua
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        List<Long> l = new ArrayList<>();
        l.add(1L);l.add(2L);
        List<Long> l2 = new ArrayList<>();
        l2.add(1L);
        System.out.println(!l.containsAll(l2));
    }
}
