package pongpon.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pongpon.springframework.services.GreetingService;
import pongpon.springframework.services.GreetingServiceInterface;

@Controller
public class GetterInjectedController {

    private GreetingServiceInterface greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("getterGreetingService") GreetingServiceInterface greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
