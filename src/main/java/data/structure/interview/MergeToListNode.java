/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/8 下午9:08
 */
package data.structure.interview;

/**
 * 合并两个有序链表，合并只好也是有序
 * 1，3，6    2，4，5   -> 1，2，3，4，5，6
 * @author HanZhonghua
 * @version 1.0
 */
public class MergeToListNode {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(6);
        ListNode listNode3 = new ListNode(8);
        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);

        listNode.next = listNode2;listNode2.next=listNode3;
        listNode4.next = listNode5;listNode5.next=listNode6;

        ListNode merge = merge(listNode, listNode4);
        while (merge != null) {
            System.out.println(merge.data);
            merge = merge.next;
        }

    }

    public static ListNode merge(ListNode node1, ListNode node2) {

        if (node1 == null && node2 == null) {
            return null;
        }
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }
        if (node1.data <= node2.data) {
            node1.next = merge(node1.next, node2);
            return node1;
        }else {
            node2.next = merge(node1, node2.next);
            return node2;
        }
    }



}

class ListNode {
    int data;
    ListNode next;

    public ListNode (int data) {
        this.data = data;
    }
}
