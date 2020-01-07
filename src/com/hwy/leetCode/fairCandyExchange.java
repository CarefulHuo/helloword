package com.hwy.leetCode;

import java.util.Scanner;

public class fairCandyExchange {

    public static void main(String[] argd) {
        int[] A = new int[2];
        int[] B = new int[2];
        int[] result = new int[2];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        for (int i = 0; i < A.length; i++) {
            B[i] = input.nextInt();
        }
        fairCandyExchange fairCandyExchange = new fairCandyExchange();
        result = fairCandyExchange.fairCandySwap(A, B);
        System.out.println(result);
    }

    public int[] fairCandySwap(int[] A, int[] B) {
        return A;
    }
}
