package pongpon.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pongpon.springframework.services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
