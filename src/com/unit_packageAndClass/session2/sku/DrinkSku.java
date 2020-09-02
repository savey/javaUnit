package com.unit_packageAndClass.session2.sku;

public class DrinkSku {
    private int id;
    private String name;

    public DrinkSku(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getCode() {
        return this.id;
    }
}
