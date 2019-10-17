package com.gof.factory.absfactory.order;

import com.gof.factory.absfactory.factory.BJFactory;
import com.gof.factory.absfactory.factory.LDFactory;

public class PizzaStore {

    public static void main(String[] args) {
        String loc = "bj";
        if (loc.equals("bj")) {
            //创建北京口味的各种Pizza
            new OrderPizza(new BJFactory());
        } else {
            //创建伦敦口味的各种Pizza
            new OrderPizza(new LDFactory());
        }
    }
}
