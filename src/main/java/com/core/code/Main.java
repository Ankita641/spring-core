package com.core.code;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Spring  Core       /   Spring MVC  / Spring AOP / Security /  DAO / spring batch   :- springboot
//We don`t need to create the objects
//while using spring we can achieve fully abstractions
//Spring works on IOC / DI
//Inversion of Control(IOC)  -- container   :-  ApplicationContext , BeanFactory
//Using IOC : We don`t need to create the objects  , it will create beans , initialize beans , dispose the beans
//DI - Dependency Injection
//Using DI: We don't need to create an object instead of that we will tell which bean is going to use by beans and class names
//                                           bean name class name   // @Componenet
//how to access the variables
//Getter/Setter :- Property   , optional filed we can write
//Constructor :-   Constructor arg   , mandatory fields needs to write


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //BeanFactory app = new ClassPathXmlApplicationContext("applicationContex.xml");
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContex.xml");
        Company cm = (Company) app.getBean("company");
        cm.register();

        Organization or = (Organization) app.getBean("org");
        or.register();
    }
}