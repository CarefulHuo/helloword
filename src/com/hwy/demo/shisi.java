package com.hwy.demo;


public class shisi {
    public static void main(String[] args) {
        int[] arrays = {2, 6, 8, 13, 15, 17, 17, 18, 19, 20};
        shisi s = new shisi();
        int result = s.binarySearch(arrays, 15);
        System.out.println(result);
    }

    public int binarySearch(int[] nums, int target) {
        // write your code here
        boolean flag = true;
        int res = nums.length / 2;
        while (flag) {
            if (target == nums[res] || res == 0 || res == nums.length - 1) {
                if (nums[res] != target) {
                    res = -1;
                }
                for (int i = 0; i < res; i++) {
                    if (nums[i] == nums[res]) {
                        res = i;
                        break;
                    }
                }
                flag = false;
            } else if (target > nums[res]) {
                if (res > (nums.length / 2)) {
                    res = (nums.length - res) / 2 + res;
                } else {
                    res = res / 2;
                }

            } else if (target < nums[res]) {
                res = res / 2;
            }
        }
        return res;
    }
}

