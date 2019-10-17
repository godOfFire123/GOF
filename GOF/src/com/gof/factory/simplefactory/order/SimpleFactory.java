package com.gof.factory.simplefactory.order;
import com.gof.factory.simplefactory.pizza.CheesePizza;
import com.gof.factory.simplefactory.pizza.GreekPizza;
import com.gof.factory.simplefactory.pizza.Pizza;

/**
 * 简单工厂类
 */
public class SimpleFactory {

    public static Pizza createPizza(String orderType){
        Pizza pizza = null;
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }
}
