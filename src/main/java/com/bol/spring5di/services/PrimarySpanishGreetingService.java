package com.bol.spring5di.services;

public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String SayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}