package com.bol.spring5di.services;

public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String SayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
