时间，空间复杂度分析，在数据结构与算法中是非常重要的。虽然现在有各种各样的监控，统计就可以得到算法的执行时间和内存占用，为什么还需要时间，空间复杂度分析呢？
这种监控统计也叫做：时候统计法，比较受限：

1.测试接口严重依赖测试环境
2.测试结果受数据规模影响很大

所以，需要一个不用具体的测试数据，就可以大体估算出执行效率的方法，也就是所谓的时间，空间复杂度分析。

首先看下【时间复杂度】，表示代码执行时间随着数据规模增长而变化的趋势
复杂度按照量级递增，主要有以下量级
1.常量阶 O(1) 不存在循环，只是"常量"的一行行的代码，不管有多少行，10000，甚至1000000，对应的时间复杂度都是常量阶

    void mail(int a) {
        int sum = 0;
        int sum = a;
        ...
    }

2.对数阶 O(logn)
    这个稍微复杂一点，
    void mail(int a) {
        int sum = 0;
        for (int i = 0; i<n;i++) {
            i = i * 2;
        }
        System.out.println(sum);
    }
    以上代码就表示 O(logn)

3.线性阶 O(n) 简单的单重for循环

    void mail(int a) {
        int sum = 0;
        for (int i = 0; i<n;i++) {
            sum += i;
        }
        System.out.println(sum);
    }

4.线性对数阶 O(nlogn)

    for (int x=0;x<n;x++) {
        void mail(int a) {
            int sum = 0;
            for (int i = 0; i<n;i++) {
                i = i * 2;
            }
            System.out.println(sum);
        }
    }

5.平方阶 O(2 的n次方)  多重for循环

【空间复杂度】
空间复杂度相对时间复杂度更加简单，常用的空间复杂度有 O(1) O(n) O(n2)  至于O(logn) O(nlogn) 平时基本用不到