/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/26 下午11:45
 */
package data.structure.interview;

import java.util.List;

/**
 * @author HanZhonghua
 * @version 1.0
 */
public class NTree {

    public int data;
    public List<NTree> childList;

    public NTree(int data, List<NTree> childList) {
        this.data = data;
        this.childList = childList;
    }
}
