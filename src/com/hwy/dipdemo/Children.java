package com.hwy.dipdemo;

/**
 * @author hwy
 * @despertion 依赖倒转测试
 * @date 2019/12/10
 */
public class Children {
    public static void main(String[] args) {
        Monther monther = new Monther();
        monther.read(new Book());
        monther.read(new newsBook());
        monther.read();
    }
}
