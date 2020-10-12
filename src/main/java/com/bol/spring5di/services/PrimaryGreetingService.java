package com.bol.spring5di.services;

public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String SayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
