package com.gof.factory.simplefactory.notfactoryorder;

import com.gof.factory.simplefactory.order.OrderPizza;

public class PizzaStore {
    public static void main(String[] args) {
        //下订单
        new OrderPizza();
        System.out.println("~~退出程序~~");
    }
}
