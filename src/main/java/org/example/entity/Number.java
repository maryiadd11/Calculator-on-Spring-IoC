package org.example.entity;

import org.example.utils.Input;
import org.springframework.stereotype.Component;

@Component
public class Number {

    private double num;

    public Number(double num) {
        this.num = num;
    }

    public Number() {
    }

    public double getNum() {
        return Input.getDouble();
    }

    public void setNum(double num) {
        this.num = num;
    }
}
