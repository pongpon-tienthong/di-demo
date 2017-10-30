package pongpon.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pongpon.springframework.services.GreetingService;

@Controller
public class GetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("getterGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
