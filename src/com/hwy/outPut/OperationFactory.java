package com.hwy.outPut;

public class OperationFactory {
    public static Object createOperation(String objectType) {
        switch (objectType) {
            case "1":
                return new ClueOutPutOperation();
            case "3":
                return new CampOutPutOperation();
            case "4":
                return new CampOutPutOperation();
            case "5":
                return new CampOutPutOperation();
            case "6":
                return new CampOutPutOperation();
            case "7":
                return new CampOutPutOperation();
            default:
                return null;
        }
    }

}
