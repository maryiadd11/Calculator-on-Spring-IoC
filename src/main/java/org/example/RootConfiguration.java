package org.example;

import org.example.entity.Calculation;
import org.example.entity.Number;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RootConfiguration {

    @Bean
    public Number num1(){
        return new Number();
    }

    @Bean
    public Number num2(){
        return new Number();
    }

    @Bean
    public Service run(){
        return new Service();
    }

    @Bean
    public Calculation calculation(Number num1, Number num2, Service service){
        return new Calculation(num1,num2,service);
    }
}
