package pongpon.springframework.controllers;

import org.junit.Before;
import org.junit.Test;
import pongpon.springframework.services.GreetingService;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController ConstructorInjectedController;

    @Before
    public void setUp() {
        this.ConstructorInjectedController = new ConstructorInjectedController(new GreetingService());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingService.HELLO_GURU, ConstructorInjectedController.sayHello());
    }
}
