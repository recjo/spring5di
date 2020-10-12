package com.bol.spring5di.controllers;

import com.bol.spring5di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class i18nController {
    private final GreetingService greetingService;

    public i18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.SayGreeting();
    }
}
