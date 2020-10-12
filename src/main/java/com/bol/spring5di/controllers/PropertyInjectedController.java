package com.bol.spring5di.controllers;

import com.bol.spring5di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;

/*
this demostrates DI using a property
least preferred method
 */

public class PropertyInjectedController {
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.SayGreeting();
    }


}


