package com.rajarshisg.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class I18nEnglishService implements GreetingService {
    public String sayGreeting() {
        return "Hello - i18n English";
    }
}
