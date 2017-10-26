package pongpon.springframework.controllers;

import org.junit.Before;
import org.junit.Test;
import pongpon.springframework.services.GreetingService;

import static org.junit.Assert.assertEquals;

public class GetterInjectedControlerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp() {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingService());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingService.HELLO_GURU, getterInjectedController.sayHello());
    }
}
