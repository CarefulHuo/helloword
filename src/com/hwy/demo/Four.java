package com.hwy.demo;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.Comparator;

/*
@time 2018/11/8
@继承Comparator接口，实现自定义排序
@将int数组转换为Integer数组
 */

public class Four {

    public static void main(String args[]) {
        int n = 3;
        int [] nums = {1, 8, 6, 4, 5};
            Comparator compare = new MyComparator();
            Integer [] req = new Integer[nums.length];
            for(int i= 0 ; i< nums.length; i++){
                req[i] = new Integer(nums[i]);
            }
            Arrays.sort(req,compare);
        System.out.println(req[n-1]);
    }

}
class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1,Integer o2){
        return  -1;
    }
}
