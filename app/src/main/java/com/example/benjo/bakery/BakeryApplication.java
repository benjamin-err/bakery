package com.example.benjo.bakery;

import android.app.Application;

/**
 * Created by benjo on 17.08.2017..
 */

public class BakeryApplication extends Application {

    private static Integer price = 0;

    public static int getPrice() {
        return price;
    }

    public static void setPrice(Integer price) {
        BakeryApplication.price = price;
    }

    public static void add(Integer itemPrice){
        BakeryApplication.price += itemPrice;
    }
}
