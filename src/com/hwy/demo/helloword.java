package com.hwy.demo;
import java.util.Scanner;

/*
@time 2018/11/8
@数学公式：
 if(n<5) count = 0;
 if(n>=5) f(n) = k + f(k!) (k = n/5)
 */
public class helloword {
    public static void main(String args []){
        Scanner  input = new Scanner(System.in);
        Long  n = input.nextLong();
        Long req = helloword.getCall(n);
        System.out.println(req);
    }
    public static Long getCall(Long b){
         Long count = Integer.toUnsignedLong(0);
        if(b<5){
            return count;
        }else{
            b = b / 5;
            count = b + getCall(b);
        }
        return count;
    }
}
