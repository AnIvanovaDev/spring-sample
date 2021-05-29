package com.nastya.spring.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) throws PerfomanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");
        Juggler juggler = (Juggler) context.getBean("poeticDuke");
        Juggler bean = context.getBean(Juggler.class);
        juggler.perform();
        Performer kenny = (Performer) context.getBean("kenny");
        kenny.perform();
    }
}
