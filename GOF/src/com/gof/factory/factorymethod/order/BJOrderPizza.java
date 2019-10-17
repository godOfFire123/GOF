package com.gof.factory.factorymethod.order;
import com.gof.factory.factorymethod.pizza.BJCheesePizza;
import com.gof.factory.factorymethod.pizza.BJPepperPizza;
import com.gof.factory.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    protected Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
