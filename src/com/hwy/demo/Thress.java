package com.hwy.demo;

import java.util.Scanner;

/*
@time 2018/11/8
@通过字符串和整型和字符数组的互相转换
 */
public class Thress {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print(n);
        int count = 0;
        int k = input.nextInt();
        System.out.print(k);
        for(int i = 0; i<=n ;i++){
            String m = Integer.toString(i);
            char [] req = m.toCharArray();
            for(int j = 0 ; j < req.length; j++){
                if(req[j] == Integer.toString(k).charAt(0)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
