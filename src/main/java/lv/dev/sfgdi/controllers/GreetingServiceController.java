package lv.dev.sfgdi.controllers;

import lv.dev.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingServiceController {

    private final GreetingService morningGreetingService;
    private final GreetingService eveningGreetingService;

    public GreetingServiceController(@Qualifier("morningGreetingService") GreetingService morningGreetingService,
                                     @Qualifier("eveningGreetingService") GreetingService eveningGreetingService) {
        this.morningGreetingService = morningGreetingService;
        this.eveningGreetingService = eveningGreetingService;
    }

    public void printServiceGreetings() {
        System.out.println(morningGreetingService.sayGreeting());
        System.out.println(eveningGreetingService.sayGreeting());
    }
}
