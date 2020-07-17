package com.xiaoZ.structural.composite;

public abstract class CatalogComponent {
    protected Integer level = 1;
    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持添加操作");
    }
    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持删除操作");
    }
    public String getName() {
        throw new UnsupportedOperationException("不支持查询name操作");
    }
    public double getPrice() {
        throw new UnsupportedOperationException("不支持查询价格操作");
    }
    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
