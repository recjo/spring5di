package com.bol.spring5di.controllers;

import com.bol.spring5di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String SayHelloWorld() {
        return greetingService.SayGreeting();
    }
}
