package com.hwy.factory;

/**
 * 工厂模式，根据传入的计算符号来创建的对象
 */
public class easyFactory  {
    public static Operation getOperation(String operationName){
        Operation operation = null;
        switch (operationName){
            case "+":
                operation = new OperationAdd();break;
            case "-":
                operation = new OperationLess();break;
            case "*":
                operation = new OperationMultiply();break;
        }
        return operation;
    }
}
