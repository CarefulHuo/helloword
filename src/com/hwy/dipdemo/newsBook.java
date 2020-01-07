package com.hwy.dipdemo;

public class newsBook implements Content {
    @Override
    public String getContent() {
        return "时刻准备着！！！！";
    }

    @Override
    public String getTiltle() {
        return "报纸";
    }
}
