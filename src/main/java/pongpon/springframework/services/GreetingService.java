package pongpon.springframework.services;

public class GreetingService implements GreetingServiceInterface {

    public static final String HELLO_GURU = "Hello Guru!";

    @Override
    public String sayGreeting() {
        return HELLO_GURU;
    }
}
