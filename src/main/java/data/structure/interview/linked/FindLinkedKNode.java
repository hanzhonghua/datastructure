/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/14 下午9:35
 */
package data.structure.interview.linked;

import data.structure.interview.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * 寻找链表的倒数第k个元素
 *
 * 思路：定义两个指针，先让第一个指针和第二个指针都指向头节点，然后让第一个指针向后移动k-1步，到达k节点
 * 然后两个指针同时向后移动，第一个指针到达尾部，那么第二个指针的位置就是倒数第k节点了
 * @author HanZhonghua
 * @version 1.0
 */
public class FindLinkedKNode {

    public static void main(String[] args) {

        String str = "12321asddag3";
        char[] chars = str.toCharArray();
        int max=0;int start=0;
        Map<Character, Integer> map =  new HashMap<>();
        for (int  i=0; i<chars.length; i++){

            char aChar = chars[i];
            if (map.containsKey(aChar)) {
                start = Math.max(start, i);
            }
            map.put(aChar, i);

            max =  Math.max(max, i-start+1);
        }
        System.out.println(max);
    }

    public static Node getNode(Node node, int k){

        Node first = node, second = node;
        for (int i=0;i<k-1;i++){
            if(first.next!=null) {
                first = first.next;
            }else {
                return null;
            }
        }

        while (first!=null){
            first=first.next;
            second=second.next;
        }
        return second;
    }
}
