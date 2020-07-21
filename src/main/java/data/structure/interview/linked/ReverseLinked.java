/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/14 下午11:15
 */
package data.structure.interview.linked;

import data.structure.interview.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * 单链表反转
 * 遍历反转和递归反转
 *
 * 遍历
 * 首先准备两个变量 Node pre, Node next, pre记录反转后的链表，next记录中间变量
 *
 * @author HanZhonghua
 * @version 1.0
 */
public class ReverseLinked {

    public static void main(String[] args) {

    }

    public static Node reverse(Node node) {

        Node pre = null;
        Node next = null;
        while (node != null) {
            // 记录node 的下一个节点，防止转换过程中丢失节点
            next = node.next;
            // 指针交换
            node.next = pre;
            // 把当前node 的值赋给 pre
            pre = node;
            // node 往后移动一个节点
            node = next;
        }
        return pre;
    }
}
