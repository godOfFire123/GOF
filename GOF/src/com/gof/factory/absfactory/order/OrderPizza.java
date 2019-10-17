package com.gof.factory.absfactory.order;
import com.gof.factory.absfactory.factory.AbsFactory;
import com.gof.factory.absfactory.pizza.Pizza;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    private AbsFactory factory;

    public OrderPizza(AbsFactory factory){
        this.setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        //工厂可能是北京的，也可能是伦敦的
        this.factory = factory;
        do {
            String orderType = this.getType();
            pizza = factory.createPizza(orderType);
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
