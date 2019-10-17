package com.gof.factory.simplefactory.notfactoryorder;
import com.gof.factory.simplefactory.pizza.CheesePizza;
import com.gof.factory.simplefactory.pizza.GreekPizza;
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
            String orderType = this.getType();//订购披萨的类型
            if (orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else if (orderType.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }else {
                break;
            }
            //输出pizza 制作过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
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
