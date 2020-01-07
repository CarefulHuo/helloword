package com.hwy.facade;

/**
 * @author hwy
 * 外观模式的高层接口（需要了解所涉及的子系统的特点和属性，将其进行组合使用）
 * @date 2019/7/30
 */
public class Facade {
    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;
    private SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodFacadeA() {
        System.out.println("方法组A");
        one.methodOne();;
        two.methodTwo();
        four.methodFour();
    }

    public void methodFacadeB() {
        System.out.println("方法组B");
        three.methodThree();
        two.methodTwo();
        one.methodOne();
    }
}
