package com.rajarshisg.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpanishService implements GreetingService {
    public String sayGreeting() {
        return "Hello - i18n Spanish";
    }
}
