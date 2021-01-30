package lv.dev.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("LV")
@Service("languageService")
public class LatvianGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Sveika pasaule";
    }
}
