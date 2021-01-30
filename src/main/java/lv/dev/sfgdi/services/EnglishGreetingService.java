package lv.dev.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("languageService")
public class EnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello world";
    }
}
