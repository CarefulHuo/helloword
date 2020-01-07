package com.hwy.outPut;

public class JsonUnitls {
    public static Object getResult(String Json){
        ClueOutPutOperation clueOutPut = (ClueOutPutOperation) OperationFactory.createOperation("1");
        clueOutPut.setNormFlg(Json);
        return clueOutPut;
    }
}
