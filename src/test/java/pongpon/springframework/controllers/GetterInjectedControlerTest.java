package pongpon.springframework.controllers;

import org.junit.Before;
import org.junit.Test;
import pongpon.springframework.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class GetterInjectedControlerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp() {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURU, getterInjectedController.sayHello());
    }
}
