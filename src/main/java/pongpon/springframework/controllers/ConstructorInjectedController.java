package pongpon.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pongpon.springframework.services.GreetingServiceInterface;

@Controller
public class ConstructorInjectedController {

    private GreetingServiceInterface greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingServiceInterface greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
