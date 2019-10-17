package com.gof.factory.factorymethod.order;
import com.gof.factory.factorymethod.pizza.LDCheesePizza;
import com.gof.factory.factorymethod.pizza.LDPepperPizza;
import com.gof.factory.factorymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    protected Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
