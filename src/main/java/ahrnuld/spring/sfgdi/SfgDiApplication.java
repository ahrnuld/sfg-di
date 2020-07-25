package ahrnuld.spring.sfgdi;

import ahrnuld.spring.sfgdi.controllers.ConstructorInjectedController;
import ahrnuld.spring.sfgdi.controllers.I18nController;
import ahrnuld.spring.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController)ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());


		MyController myController = (MyController)ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
