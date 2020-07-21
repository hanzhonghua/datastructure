/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/18 下午12:11
 */
package data.structure.interview.doublelinked;

import data.structure.interview.DoubleNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 双向链表反转
 * @author HanZhonghua
 * @version 1.0
 */
public class ReverseDoubleLinked {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
    }

    public static DoubleNode reverse(DoubleNode node) {

        DoubleNode pre = null;
        DoubleNode next;

        while (node!=null) {
            // 记录链表的下一个节点
            next = node.next;

            // 链表当前节点
            node.next = pre;
            node.pre = next;
            // 当前节点的值赋给pre
            pre = node;

            // 当前节点向后移动一个位置
            node = next;
        }
        return pre;
    }
}
