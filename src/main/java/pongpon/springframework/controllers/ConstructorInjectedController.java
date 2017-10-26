package pongpon.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pongpon.springframework.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    @Autowired
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
