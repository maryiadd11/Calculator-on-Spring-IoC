package org.example;


import org.example.entity.Calculation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RootConfiguration.class);
        Calculation calculation = context.getBean(Calculation.class);
        System.out.println(calculation.run());
    }
}
