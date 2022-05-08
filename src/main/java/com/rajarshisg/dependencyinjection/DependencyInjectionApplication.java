package com.rajarshisg.dependencyinjection;

import com.rajarshisg.dependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        System.out.println("---- i18N Controller ----");

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");

        System.out.println(i18nController.sayGreeting());

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

        System.out.println("---- Property Injected Controller ----");

        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.sayGreeting());

        System.out.println("---- Setter Injected Controller ----");

        SetterInjectedController setterInjectedController =
                (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.sayGreeting());

        System.out.println("---- Constructor Injected Controller ----");

        ConstructorInjectedController constructorInjectedController =
                (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.sayGreeting());


    }

}
