package pongpon.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingServiceInterface {

    @Override
    public String sayGreeting() {
        return "Hello, Primary Greeting Service";
    }
}
