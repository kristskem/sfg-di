package lv.dev.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHelloWorld() {

        System.out.println("Hello world");
        return "Hi folks!";
    }
}
