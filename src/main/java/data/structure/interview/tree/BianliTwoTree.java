/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/27 下午11:30
 */
package data.structure.interview.tree;

import data.structure.interview.TwoTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树遍历
 * @author HanZhonghua
 * @version 1.0
 */
public class BianliTwoTree {

    public static void main(String[] args) {
        TwoTree t4 = new TwoTree(4, null, null);
        TwoTree t5 = new TwoTree(5, null, null);
        TwoTree t6 = new TwoTree(6, null, null);
        TwoTree t7 = new TwoTree(7, null, null);

        TwoTree t2 = new TwoTree(2, t4, t5);
        TwoTree t3 = new TwoTree(3, t6, t7);

        TwoTree t1 = new TwoTree(1, t2, t3);

        List<Integer> result = new ArrayList<>();
        bfs(t1, result);
        for (Integer i : result) {
            System.out.print(i);
        }
    }

    // 深度优先遍历
    private static void dfs (TwoTree tree, List<Integer> result) {
        if (tree == null) {
            return;
        }
        // result.add(tree.data); 放这里就是先序
        dfs(tree.left, result);
        // result.add(tree.data); 放这里就是中序
        dfs(tree.right, result);
        // result.add(tree.data); 放这里就是后序
        result.add(tree.data);
    }

    // 广度优先遍历
    private static void bfs (TwoTree tree, List<Integer> result) {
        if (tree == null) {
            return;
        }
        Queue<TwoTree> queue = new LinkedList<>();
        queue.offer(tree);
        result.add(tree.data);

        while (!queue.isEmpty()) {
            int size = queue.size();
            System.out.println(size);
            while (size>0) {
                TwoTree t = queue.poll();
                if (t!=null && t.left!=null) {
                    queue.offer(t.left);
                    result.add(t.left.data);
                }
                if(t!=null && t.right!=null){
                    queue.offer(t.right);
                    result.add(t.right.data);
                }
                size--;
            }
        }

    }
}
