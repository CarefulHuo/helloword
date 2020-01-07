package com.hwy.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ten {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<String> parmList = new ArrayList<>();
        while (n-- > 0) {
            parmList.add(input.next());
        }
        List<String> results = getResult(parmList);
        for (String res : results) {
            System.out.println(res);
        }
    }

    public static List<String> getResult(List<String> parms) {
        List<String> resultList = new ArrayList<>();
        for (String parmStr : parms) {
            if ("PAT".equals(parmStr)) {
                resultList.add("YES");
                continue;
            } else if (getTypeTwo(parmStr)) {
                resultList.add("YES");
            } else if (getTypeThree(parmStr)) {
                resultList.add("YES");
            } else {
                resultList.add("NO");
            }
        }
        return resultList;
    }

    public static boolean getTypeTwo(String parm) {
        char[] parmArray = parm.toCharArray();
        for (int i = 0; i < parmArray.length - 2; i++) {
            if (parmArray[i] == 'P' && parmArray[i + 1] == 'A' && parmArray[i + 2] == 'T') {
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean getTypeThree(String parm) {
        char[] parmArray = parm.toCharArray();
        for (int i = 0; i < parmArray.length - 2; i++) {
            if (parmArray[i] == 'P' && parmArray[i + 1] == 'A' && parmArray[i + 2] == 'T') {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
