package com.rajarshisg.dependencyinjection.controllers;

import com.rajarshisg.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    // we can skip @Autowired for constructor based DI
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService")
                                         GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
