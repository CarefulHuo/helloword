package com.hwy.factory;

/**
 * 继承运算类重写计算结果的方法
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return (numberA + numberB);
    }
}
