/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/14 下午9:29
 */
package data.structure.interview;

/**
 * @author HanZhonghua
 * @version 1.0
 */
public class Node {

    public int data;
    public Node next;

    public Node (int data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node) {
            Node node = (Node) obj;
            return node.data == this.data && node.next.equals(this.next);
        }
        return false;
    }
}
