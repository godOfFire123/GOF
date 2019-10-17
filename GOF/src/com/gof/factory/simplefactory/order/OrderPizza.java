package com.gof.factory.simplefactory.order;
import com.gof.factory.simplefactory.pizza.Pizza;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 传统方式的优缺点
 *  1.优点是比较好理解，简单易操作。
 *  2.缺点是违反了设计模式的《ocp原则》，对扩展开放，对修改关闭。当我们
 *    给类增加新功能时，尽量不修改代码，或者尽可能少修改代码
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        do {
            String orderType = this.getType();
            pizza = SimpleFactory.createPizza(orderType);
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
