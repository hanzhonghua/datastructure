/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/26 下午11:43
 */
package data.structure.interview.tree;

import data.structure.interview.NTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * n 叉树树前序遍历，使用递归或者迭代都可以
 * @author HanZhonghua
 * @version 1.0
 */
public class NTreeDemo {


    public static void main(String[] args) {

        NTree t5 = new NTree(5, null);
        NTree t6 = new NTree(6, null);

        List<NTree> l2 = new ArrayList<>();
        l2.add(t5);l2.add(t6);

        NTree t2 = new NTree(3, l2);
        NTree t3 = new NTree(2, null);
        NTree t4 = new NTree(4, null);

        List<NTree> l1 = new ArrayList<>();
        l1.add(t2);l1.add(t3);l1.add(t4);

        NTree t1 = new NTree(1, l1);

        List<Integer> result = new ArrayList<>();
        diGui(t1, result);
        for (Integer i : result) {
            System.out.print(i);
        }
    }

    /**
     * 递归：先序，头-左-右
     * @param tree
     * @param l
     */
    public static void diGui(NTree tree, List<Integer> l) {
        if (tree == null) {
            return;
        }
        l.add(tree.data);
        List<NTree> childList = tree.childList;
        if(childList != null && childList.size() > 0) {
            for (NTree t : childList) {
                diGui(t, l);
            }
        }
    }

}
