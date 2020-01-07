package com.hwy.demo;

public class BubbleSort {

    public static void main(String [] args){
        int [] arrays = {2,4,1,3,7};
        int [] a = bubbleSort(arrays);
        for (int i = 0 ; i< a.length ; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int [] bubbleSort(int [] parms){ //冒泡排序
        for (int i = 1 ; i < parms.length ; i++){
            boolean flg = true;
            for (int j = 0 ; j < parms.length-i; j ++){
                if (parms[j] > parms [j+1]){
                    int t = parms[j];
                    parms[j] = parms[j+1];
                    parms[j+1] = t;
                }
                flg = false;
            }
            if (flg){
                break;
            }
        }
        return parms;
    }

}
