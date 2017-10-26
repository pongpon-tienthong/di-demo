package pongpon.springframework.controllers;

import pongpon.springframework.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
