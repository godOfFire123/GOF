package com.glong.factory.simpleFactory.operation;
import java.util.Scanner;

/**
 * 计算器类
 */
public class Operation01 {

    public static void main(String[] args) {
        System.out.println("请输入数字A:");
        Scanner in = new Scanner(System.in);
        double numberA = in.nextDouble();

        System.out.println("请输入运算符号:");
        in = new Scanner(System.in);
        String opretor = in.nextLine();

        System.out.println("请输入数字B:");
        in = new Scanner(System.in);
        double numberB = in.nextDouble();

        double result = 0;
        switch (opretor){
            case "+":
                result = numberA + numberB;break;
            case "-":
                result = numberA - numberB;break;
            case "*":
                result = numberA * numberB;break;
            case "/":
                if (numberB !=0){
                    result = numberA / numberB;
                }else{
                    System.out.println("除数不能为0");
                }
                break;
        }
        System.out.println("结果是："+result);
    }


}
