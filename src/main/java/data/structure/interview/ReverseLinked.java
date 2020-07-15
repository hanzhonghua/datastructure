/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/14 下午11:15
 */
package data.structure.interview;

/**
 * 单链表反转
 * 遍历反转和递归反转
 *
 * 遍历
 * 遍历链表时，需要将当前节点的 next 指向前一个元素。由于当前节点没有引用其上一个节点，因此遍历时需要储备前一个元素
 * 在更改之前，还需要另一个指针存储下一个节点
 * @author HanZhonghua
 * @version 1.0
 */
public class ReverseLinked {

    public static void main(String[] args) {

    }

    public static Node reverse(Node node) {

        Node result = null;
        Node old = node;
        while (old.next!=null){
            Node now = old.next;
            old.next=result;
            result=old;
            old=now;
        }
        return result;
    }
}
