package pongpon.springframework.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello() {
        System.out.println("Hello World");
        return "Run ...";
    }
}
