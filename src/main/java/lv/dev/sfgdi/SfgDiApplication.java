package lv.dev.sfgdi;

import lv.dev.sfgdi.controllers.ConstructorInjectedController;
import lv.dev.sfgdi.controllers.GreetingServiceController;
import lv.dev.sfgdi.controllers.LanguageController;
import lv.dev.sfgdi.controllers.MyController;
import lv.dev.sfgdi.services.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		MyController controller = context.getBean("myController", MyController.class);
		String greeting = controller.sayHelloWorld();
		System.out.println(greeting);

		System.out.println("Constructor injected example");

		ConstructorInjectedController constructorInjectedController =
				context.getBean("constructorInjectedController", ConstructorInjectedController.class);

		System.out.println(constructorInjectedController.getGreetings());

		System.out.println("---Greeting service controller---");
		GreetingServiceController greetingServiceController = context.getBean("greetingServiceController",
																			  GreetingServiceController.class);
		greetingServiceController.printServiceGreetings();

		System.out.println("---Profile---");
		LanguageController languageController = context.getBean("languageController", LanguageController.class);
		System.out.println(languageController.sayHello());
	}
}
