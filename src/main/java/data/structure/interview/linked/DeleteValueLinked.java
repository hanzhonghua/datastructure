/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/18 下午3:32
 */
package data.structure.interview.linked;

import data.structure.interview.Node;

/**
 * 删除单链表中值等于 num 的节点
 * @author HanZhonghua
 * @version 1.0
 */
public class DeleteValueLinked {

    public static void main(String[] args) {

        Node head = new Node(3);
        Node node2 = new Node(1);head.next=node2;
        Node node3 = new Node(3);node2.next=node3;
        Node node4 = new Node(2);node3.next=node4;
        Node node5 = new Node(3);node4.next=node5;
        Node node6 = new Node(3);node5.next=node6;
        Node node7 = new Node(6);node6.next=node7;
        Node node8 = new Node(7);node7.next=node8;

        Node delete = delete(head, 3);
        while (delete!=null){
            System.out.println(delete.data);
            delete=delete.next;
        }
    }

    public static Node delete(Node head, int num) {

        // 先删除头部=num值的节点
        while (head != null){
            if(head.data != num){
                break;
            }
            head  = head.next;
        }

        // 记录不是 num 值的头节点
        Node pre = head;
        Node cul = head;

        while (cul != null){
            if (cul.data == num) {
                pre.next = cul.next;
            } else {
                pre = cul;
            }
            cul = cul.next;
        }
        return head;
    }
}
