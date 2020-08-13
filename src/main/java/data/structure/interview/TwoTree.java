/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/27 下午1:04
 */
package data.structure.interview;

/**
 * 二叉树
 * @author HanZhonghua
 * @version 1.0
 */
public class TwoTree {

    public int data;
    public TwoTree left;
    public TwoTree right;

    public TwoTree(){}

    public TwoTree(int data, TwoTree left, TwoTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
