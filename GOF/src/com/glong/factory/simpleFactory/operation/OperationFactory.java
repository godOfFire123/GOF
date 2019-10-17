package com.glong.factory.simpleFactory.operation;

/**
 *
 */
public class OperationFactory {

    public static CommOperation createOperation(String operation){
        CommOperation oper = null;
        switch (operation){
            case "+":
                oper = new OperationAdd();break;
//            case "-":
//                result = numberA - numberB;break;
//            case "*":
//                result = numberA * numberB;break;
//            case "/":
//                if (numberB !=0){
//                    result = numberA / numberB;
//                }else{
//                    System.out.println("除数不能为0");
//                }
//                break;
        }
        return oper;
    }
}
