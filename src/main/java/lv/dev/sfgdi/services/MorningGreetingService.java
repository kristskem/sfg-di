package lv.dev.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class MorningGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Good morning!";
    }
}
