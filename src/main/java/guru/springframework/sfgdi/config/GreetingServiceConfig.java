package guru.springframework.sfgdi.config;

import guru.springframework.pets.PetService;
import guru.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.services.I18NSpanishGreetingService;
import guru.springframework.sfgdi.services.I18nEnglishGreetingService;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService() {
        return petServiceFactory().getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService() {
        return petServiceFactory().getPetService("cat");
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18NSpanishGreetingService i18NSpanishGreetingService() {

        return new I18NSpanishGreetingService();
    }

    @Bean
    @Profile("EN")
    I18nEnglishGreetingService i18nService() {
        return new I18nEnglishGreetingService();
    }

    @Bean
    @Primary
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }
}
