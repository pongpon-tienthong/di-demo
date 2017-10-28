package pongpon.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingServiceInterface {

    @Override
    public String sayGreeting() {
        return "Hello, Property Injecting Service";
    }
}
