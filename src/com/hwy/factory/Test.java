package com.hwy.factory;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        String symbol = input.next();
        //简单工厂模式的应用
        Operation operation = easyFactory.getOperation(symbol);
        operation.setNumberA(A);
        operation.setNumberB(B);
        double result = operation.getResult();
        System.out.println(result);
    }
}
