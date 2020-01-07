package com.hwy.factory;

/**
 * 继承运算类重写得到结果的方法
 */
public class OperationMultiply extends Operation {
    @Override
    public double getResult(){
        return (numberA * numberB);
    }
}
