package org.example.entity;

import org.example.Service;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculation {

    private Number number1;
    private Number number2;
    private Service service;

    public Calculation(@Qualifier("num1") Number number1, @Qualifier("num2") Number number2, Service service) {
        this.number1 = number1;
        this.number2 = number2;
        this.service = service;
    }

    public Number getNumber1() {
        return number1;
    }

    public void setNumber1(Number number1) {
        this.number1 = number1;
    }

    public Number getNumber2() {
        return number2;
    }

    public void setNumber2(Number number2) {
        this.number2 = number2;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public double run(){
        return service.run(getNumber1(),getNumber2());
    }




}
