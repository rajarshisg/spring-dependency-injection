package com.rajarshisg.dependencyinjection.controllers;

import com.rajarshisg.dependencyinjection.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
