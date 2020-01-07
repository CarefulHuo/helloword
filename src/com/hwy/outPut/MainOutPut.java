package com.hwy.outPut;

import java.util.HashMap;
import java.util.Map;

public class MainOutPut {
    public static void main(String args[]){
        String result = "2132432";
        ClueOutPutOperation resultObject = (ClueOutPutOperation) JsonUnitls.getResult(result);
        System.out.println("输出前-------");
        //System.out.println(resultObject.getQueryCondition());
        System.out.println("输出后-------");

        Map<Integer,Integer> res = new HashMap<>();
        res.get(12);
    }
}
