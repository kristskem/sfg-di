package lv.dev.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world from primary bean. I am the main greeting service agent, I will take care about our" +
                " services if no one else was delegated";
    }
}
