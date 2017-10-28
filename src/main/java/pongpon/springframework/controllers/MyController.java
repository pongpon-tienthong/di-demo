package pongpon.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pongpon.springframework.services.GreetingServiceInterface;

@Controller
public class MyController {

    private GreetingServiceInterface greetingService;

    @Autowired
    public MyController(GreetingServiceInterface greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello World");
        return greetingService.sayGreeting();
    }
}
