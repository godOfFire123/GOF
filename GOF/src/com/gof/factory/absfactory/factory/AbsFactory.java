package com.gof.factory.absfactory.factory;
import com.gof.factory.absfactory.pizza.Pizza;

/**
 * 使用抽象工厂来完成披萨项目
 *  1.一个抽象工厂模式的抽象层
 */
public interface AbsFactory {

    //让下面的工厂子类来具体实现
    Pizza createPizza(String orderType);
}
