package pongpon.springframework.controllers;

import org.junit.Before;
import org.junit.Test;
import pongpon.springframework.services.GreetingService;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingService();
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingService.HELLO_GURU, propertyInjectedController.sayHello());
    }
}
