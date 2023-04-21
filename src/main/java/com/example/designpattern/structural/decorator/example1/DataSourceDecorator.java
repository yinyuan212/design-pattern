package com.example.designpattern.structural.decorator.example1;

public class DataSourceDecorator implements DataSource{

    private DataSource wrapper;

    /**
     * Decorator 1. 這邊建立一個Decorator class，要繼承要被新增功能的class
     * (我們要在DataSource新增功能，，DataSource就是wrapped object，新功能叫做wrapper 包裝紙)，
     * 並在constructor放進這個wrapped object
     * 要加入的功能(wrapper)，都要繼承這個Decorator
     */
    public DataSourceDecorator(DataSource dataSource) {
        this.wrapper = dataSource;
    }

    /**
     * Decorator 2. 呼叫wrapper的方法
     */

    @Override
    public void writeData(String data) {
        wrapper.writeData(data); // 這邊要呼叫從constructor 帶進來的參數的wrapper
    }

    @Override
    public String readData() {
        return wrapper.readData();// 這邊要呼叫從constructor 帶進來的參數的wrapper
    }
}
