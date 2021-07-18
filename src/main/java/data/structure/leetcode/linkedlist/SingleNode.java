/**
 * Copyright (c) 2021 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2021/7/18 下午7:32
 */
package data.structure.leetcode.linkedlist;

/**
 * @author HanZhonghua
 * @version 1.0
 */
public class SingleNode {

    public int data;
    public SingleNode next;

    public static SingleNode initSingleNode() {

        SingleNode node1 = new SingleNode();
        node1.data=1;

        SingleNode node2 = new SingleNode();
        node2.data=2;
        node1.next = node2;

        SingleNode node3 = new SingleNode();
        node3.data=3;
        node2.next = node3;

        SingleNode node4 = new SingleNode();
        node4.data=4;
        node3.next = node4;

        node4.next = null;

        return node1;
    }

    public static void print(SingleNode node) {
        while (node != null) {
            SingleNode next = node.next;
            System.out.print(node.data);
            System.out.print(" ");
            node = next;
        }
    }

}
