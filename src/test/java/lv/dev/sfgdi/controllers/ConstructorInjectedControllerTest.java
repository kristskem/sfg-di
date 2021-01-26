package lv.dev.sfgdi.controllers;

import lv.dev.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreetings() {
        String greetings = controller.getGreetings();
        System.out.println(greetings);
        assertEquals(greetings, "Hello world!");
    }
}