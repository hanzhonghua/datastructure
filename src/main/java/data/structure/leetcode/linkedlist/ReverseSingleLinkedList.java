/**
 * Copyright (c) 2021 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2021/7/18 下午7:17
 */
package data.structure.leetcode.linkedlist;

/**
 * leetCode 206 反转单链表
 *
 * 1|next -> 2|next -> 3|next -> 4|next -> null 变成 4|next -> 3|next -> 2|next -> 1|next -> null
 *
 * 思路：从头节点开始一个结点一个结点的反转，借助中间变量。注意链表临界值以及不要丢失指针
 *
 * 首先，定义初始变量 Node pre = null;
 * 记录头节点的next，既是Node next = head.next;
 * 然后将head的next指向pre：head.next = pre;
 * 将pre记录为head：pre = head;
 * 最后head向后移动一个位置：head = next;
 *
 * 经过第一次反转如下：
 * null <- 1|next  2|next -> 3|next -> 4|next -> null
 *                  next
 *          pre
 *                  head
 * 第二次反转：
 * null <- 1|next <- 2|next  3|next -> 4|next -> null
 *                            next
 *                    pre
 *                            head
 *
 * 循环以上步骤，直到head = null，代码如下
 *
 * @author HanZhonghua
 * @version 1.0
 */
public class ReverseSingleLinkedList {

    public static void main(String[] args) {

        SingleNode node = SingleNode.initSingleNode();
        SingleNode.print(node);
        SingleNode reverse = reverse(node);
        System.out.println();
        SingleNode.print(reverse);

    }

    private static SingleNode reverse(SingleNode head) {

        SingleNode pre = null;

        while (head != null) {
            SingleNode next = head.next;

            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}

