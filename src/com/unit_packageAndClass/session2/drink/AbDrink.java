package com.unit_packageAndClass.session2.drink;

import com.unit_packageAndClass.session2.sku.DrinkSku;

import java.util.ArrayList;

public abstract class AbDrink {

    protected ArrayList<DrinkSku> skus = new ArrayList<>();

    private Integer id;
    private String name;

    public AbDrink(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getCode() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }


    public void addSku(DrinkSku drinkSku) {
        this.skus.add(drinkSku);
    }


    public ArrayList<DrinkSku> getSkus() {
        return this.skus;
    }


    public String getformatSku() {
        String skuStr = "";
        if (this.skus.size() > 0) {
            for (DrinkSku sku: this.skus) {
                skuStr += sku;
            }
        }

        return skuStr;
    }
}
