package com.hwy.dipdemo;

/**
 * DIP Demo class
 *
 * @author hwy
 * @date 2019/12/10
 */
public class Monther {

    /**
     * 此种情况下monther与读什么东西耦合性太高，每次变换读的东西，都需要改代码
     */
    public void read() {
        System.out.println("monthor讲故事！！！");
        System.out.println("很久很久的以前，有一个阿拉伯人。。。。。");
    }

    /**
     * 此种情况下monther与读什么东西进行解耦了
     */
    public void read(Content content) {
        System.out.println(content.getTiltle());
        System.out.println(content.getContent());
    }
}
