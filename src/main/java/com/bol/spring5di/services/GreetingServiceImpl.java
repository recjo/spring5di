package com.bol.spring5di.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String SayGreeting() {
        return "Hello World";
    }
}
