package org.example;

import org.example.entity.Number;
import org.example.utils.Input;

public class Service {

    public double run (Number num1, Number num2) {
        String type = Input.getString();
        double result = 0;
        switch (type) {
            case "sum":
                result = num1.getNum() + num2.getNum();
                break;
            case "minus":
                result = num1.getNum() - num2.getNum();
                break;
            case "mult":
                result = num1.getNum() * num2.getNum();
                break;
            case "div":
                result = num1.getNum() / num2.getNum();
        }
        return result;
    }

}
