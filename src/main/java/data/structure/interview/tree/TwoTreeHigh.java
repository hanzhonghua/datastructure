/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/27 下午1:06
 */
package data.structure.interview.tree;

import data.structure.interview.TwoTree;

import java.util.LinkedList;

/**
 * 求二叉树的深度（高度）
 *               1
 *           2      3
 *        4    5  6   7
 * 如上图的二叉树，
 *  1.可以使用后序遍历（深度遍历），可以使用递归和栈，二叉树的深度等于 左/右子树的最大深度 + 1
 *  2.也可以使用广度优先遍历（层级遍历），使用队列实现，每遍历一层，计数器+1
 * @author HanZhonghua
 * @version 1.0
 */
public class TwoTreeHigh {

    public static void main(String[] args) {

        TwoTree t4 = new TwoTree(4, null, null);
        TwoTree t5 = new TwoTree(5, null, null);
        TwoTree t6 = new TwoTree(6, null, null);
        TwoTree t7 = new TwoTree(7, null, null);

        TwoTree t2 = new TwoTree(2, t4, t5);
        TwoTree t3 = new TwoTree(3, t6, t7);

        TwoTree t1 = new TwoTree(1, t2, t3);

        System.out.println(diGui(t1));
        System.out.println(bfs(t1));

    }

    /**
     * 递归实现
     * @param twoTree
     * @return
     */
    public static int diGui(TwoTree twoTree) {
        if (twoTree == null) {
            return 0;
        }
        return Math.max(diGui(twoTree.left), diGui(twoTree.right)) + 1;
    }

    /**
     * 广度遍历
     * @param twoTree
     * @return
     */
    public static int bfs(TwoTree twoTree) {
        if (twoTree == null) {
            return 0;
        }
        LinkedList<TwoTree> l = new LinkedList<>(), tmp;
        l.add(twoTree);
        int res = 0;
        while (!l.isEmpty()) {
            tmp  = new LinkedList<>();
            for (TwoTree t : l) {
                if (t.left!= null){
                    tmp.add(t.left);
                }
                if (t.right!= null){
                    tmp.add(t.right);
                }
            }
            l = tmp;
            res++;
        }
        return res;
    }

}
