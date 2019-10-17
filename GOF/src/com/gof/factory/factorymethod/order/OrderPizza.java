package com.gof.factory.factorymethod.order;
import com.gof.factory.factorymethod.pizza.Pizza;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    //定义一个抽象方法，createPizza,让各个工厂子类自己实现
    protected abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        Pizza pizza = null;
        do {
            String orderType = this.getType();
            pizza = createPizza(orderType);
            if (pizza!=null){

                //输出pizza 制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
                break;
            }
        }while(true);

    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
