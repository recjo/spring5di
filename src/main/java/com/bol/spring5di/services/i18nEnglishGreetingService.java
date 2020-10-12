package com.bol.spring5di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class i18nEnglishGreetingService  implements GreetingService {
    @Override
    public String SayGreeting() {
        return "Hello World";
    }
}
