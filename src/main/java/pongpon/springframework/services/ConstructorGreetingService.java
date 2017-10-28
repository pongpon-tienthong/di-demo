package pongpon.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingServiceInterface {

    @Override
    public String sayGreeting() {
        return "Hello, I was injected by Constructor.";
    }
}
