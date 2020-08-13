/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/21 下午10:38
 */
package data.structure.interview.linked;

import data.structure.interview.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * @author HanZhonghua
 * @version 1.0
 */
public class CycleLinkedNode {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);n1.next=n2;
        Node n3 = new Node(3);n2.next=n3;
        Node n4 = new Node(4);n3.next=n4;
        Node n5 = new Node(5);n4.next=n2;

        System.out.println(hasCycle(n1));

    }

    public static boolean hasCycle(Node node) {

        Set<Node> set = new HashSet<>();
        while (node != null) {
            if (set.contains(node)) {
                return true;
            }else {
                set.add(node);
            }
            node = node.next;
        }
        return false;
    }
}
