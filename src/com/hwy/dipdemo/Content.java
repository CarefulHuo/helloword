package com.hwy.dipdemo;

/**
 * DIP Demo class
 *
 * @author hwy
 * @date 2019/12/10
 */
public interface Content {
    /**
     * 获取内容
     * @return String
     */
    public String getContent();

    /**
     * 获取标题
     * @return String
     */
    public String getTiltle();
}
