package com.unit_packageAndClass.session2;

import com.unit_packageAndClass.session2.drink.AbDrink;
import com.unit_packageAndClass.session2.drink.Cola;
import com.unit_packageAndClass.session2.drink.Coffee;
import com.unit_packageAndClass.session2.drink.Water;
import com.unit_packageAndClass.session2.sku.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //准备可以选择的饮品
        Coffee coffee = new Coffee(MarketingService.COFFEE, "咖啡");
        Water water   = new Water(MarketingService.WATER, "矿泉水");
        Cola cola     = new Cola(MarketingService.COCA, "可乐");
        //为每个饮品准备可以选择的规格
        DrinkSku milk = new Milk(1, "牛奶");
        DrinkSku sugar = new Sugar(2, "糖");
        DrinkSku coca = new Coca(3, "可口可乐");
        DrinkSku bais = new Bais(4, "百事可乐");
        //添加进去
        coffee.addSku(milk);
        coffee.addSku(sugar);

        cola.addSku(coca);
        cola.addSku(bais);

        MarketingService ser = new MarketingService();
        ser.addDrink(coffee);
        ser.addDrink(water);
        ser.addDrink(cola);

        System.out.print(ser.selectProducts());
        Scanner scanner = new Scanner(System.in);
        int productSelect = scanner.nextInt();

        AbDrink drink = ser.selectBuyProduct(productSelect);

        String result = "您购买的商品：" + drink.getName();

        if (ser.hasSkus(productSelect)) {
            System.out.print(ser.selectSkus(productSelect));
            int skuSelect = scanner.nextInt();

            DrinkSku buySku = ser.getOneDrinkSku(productSelect, skuSelect);

            result += "，您选择的规格是：" + buySku.getName();
        }

        System.out.println(result);

    }
}
