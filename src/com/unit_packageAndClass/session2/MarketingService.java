package com.unit_packageAndClass.session2;

import com.unit_packageAndClass.session2.drink.AbDrink;
import com.unit_packageAndClass.session2.sku.DrinkSku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MarketingService {

    //定义可以售卖的商品 ID
    public static final int COFFEE = 1;
    public static final int WATER = 2;
    public static final int COCA = 3;

    Map<Integer, AbDrink> driks = new HashMap<>();

    ArrayList<Object> cart = new ArrayList<>();

    public void addDrink(AbDrink drink) {
        if (!this.driks.containsKey(drink.getCode())) {
            this.driks.put(drink.getCode(), drink);
        }
    }

    public AbDrink  selectBuyProduct(Integer productSelect) {
        AbDrink selectDrink = this.driks.get(productSelect);

        return selectDrink;
    }


    public String selectProducts() {

        String pro = "请选择你要购买的商品:";
        Iterator iter = this.driks.keySet().iterator();
        while (iter.hasNext()) {
            Integer code = (Integer) iter.next();
            AbDrink abDrink = this.driks.get(code);
            pro += String.format("[%d](%s)",  abDrink.getCode(), abDrink.getName());
        }

        return pro + "__";
    }


    public Boolean hasSkus(Integer code) {
        ArrayList skus = this.getSkuByProductCode(code);
        if (skus.size() > 0) {
            return true;
        }
        return false;
    }


    public String selectSkus(Integer code) {
        ArrayList<DrinkSku> skus = this.getSkuByProductCode(code);
        String skuStr = "请选择你要购买的商品规格：";
        for (DrinkSku drinkSku: skus) {
            skuStr += String.format("[%d](%s)", drinkSku.getCode(), drinkSku.getName());
        }

        return skuStr + "__";
    }

    private ArrayList<DrinkSku> getSkuByProductCode(Integer code) {
        AbDrink abDrink = this.driks.get(code);
        ArrayList<DrinkSku> skus = abDrink.getSkus();
        return skus;
    }


    public DrinkSku getOneDrinkSku(Integer drinkCode, Integer skuCode) {
        ArrayList<DrinkSku> skus = this.getSkuByProductCode(drinkCode);

        for (DrinkSku drinkSku: skus) {
            if (drinkSku.getCode() == skuCode) {
                return drinkSku;
            }
        }
        return null;
    }
}
