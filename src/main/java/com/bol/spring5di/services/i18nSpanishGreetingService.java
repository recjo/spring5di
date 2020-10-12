package com.bol.spring5di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class i18nSpanishGreetingService   implements GreetingService {
    @Override
    public String SayGreeting() {
        return "Hola Mundo";
    }
}
