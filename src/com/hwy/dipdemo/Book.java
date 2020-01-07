package com.hwy.dipdemo;

public class Book implements Content {
    @Override
    public String getContent() {
        return "很久很久的以前，有一个阿拉伯人。。。。。";
    }

    @Override
    public String getTiltle() {
        return "故事会";
    }
}
