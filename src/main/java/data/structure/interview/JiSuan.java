/**
 * Copyright (c) 2020 XiaoMi Inc.All Rights Reserved.
 * Email: hanzhonghua1@xiaomi.com
 * Author: 韩忠华
 * Date:2020/7/12 下午6:30
 */
package data.structure.interview;

/**
 * @author HanZhonghua
 * @version 1.0
 */
public class JiSuan {

    public static void main(String[] args) {
        int[] a={1,2};
        int[] b={3,4};
        int[] result = getResult(a, b);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }

    public static int[] getResult(int[] a, int[] b){
        int i=0,j=0;
        int[] res = new int[a.length+b.length];
        for(int m=0;m<res.length;m++){
            if(i<a.length&&j<b.length){
                if(a[i]<b[j]){
                    res[m]=a[i];
                    i++;
                }else{
                    res[m]=b[j];
                    j++;
                }
            }else if(i<a.length){
                res[m]=a[i];
                i++;
            }else if(j<b.length){
                res[m]=b[j];
                j++;
            }
        }
        return res;
    }
}
