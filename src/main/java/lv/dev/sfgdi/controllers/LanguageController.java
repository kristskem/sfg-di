package lv.dev.sfgdi.controllers;

import lv.dev.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class LanguageController {

    private final GreetingService greetingService;

    public LanguageController(@Qualifier("languageService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
