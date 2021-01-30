package lv.dev.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class EveningGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Good evening!";
    }
}
