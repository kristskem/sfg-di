package lv.dev.sfgdi.controllers;

import lv.dev.sfgdi.services.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings() {
        return greetingService.sayGreeting();
    }
}
