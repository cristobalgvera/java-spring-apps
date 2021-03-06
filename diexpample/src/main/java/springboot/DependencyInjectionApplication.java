package springboot;

import learning.spring.di.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan it's used for scan another package and use it's @Components,
// @Controllers, @Servers, and so on.
@ComponentScan("learning.spring.di")
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        // "Initialize" the application. It's kind of core line in every Spring app (?)
        ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);
        /*
            Getting bean controller class "GreetingController" by ApplicationContext's getBean(String) method.
            That means whenever class it's instantiate, Spring decide what kind of greetings should it write.
            Spring decide via "application.properties" settings.
         */
        GreetingController greetingController = (GreetingController) applicationContext.getBean("greetingController");
        greetingController.sayHello();
    }

}
