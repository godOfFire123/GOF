package com.gof.factory.absfactory.factory;
import com.gof.factory.absfactory.pizza.BJCheesePizza;
import com.gof.factory.absfactory.pizza.BJPepperPizza;
import com.gof.factory.absfactory.pizza.Pizza;

/**
 * BJ工厂子类
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
