package com.xiaoZ.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog extends CatalogComponent {
    private String name;
    private List<CatalogComponent> list = new ArrayList();

    public CourseCatalog(String name) {
        this.name = name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        catalogComponent.level = this.level + 1;
        list.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        list.remove(catalogComponent);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent catalogComponent : list) {
            for (int i = 0; i < this.level; i++) {
                System.out.print("  ");
            }
            catalogComponent.print();
        }
    }
}
