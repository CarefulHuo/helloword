package com.hwy.factory;

/**
 * 运算类的父类
 */
public class Operation {
    public double numberA = 0d;
    public double numberB = 0d;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getResult() {
        double result = 0;
        return result;
    }
}
