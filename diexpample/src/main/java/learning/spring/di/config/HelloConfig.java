package learning.spring.di.config;

import learning.spring.di.services.HelloWorldService;
import learning.spring.di.services.HelloWorldServiceEnglishImpl;
import learning.spring.di.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/*
    @Configuration interface tells Spring this class shows the structure of execution. This case,
    setting @Profiles and @Bean creation methods.
 */

@Configuration
public class HelloConfig {
    /*
        Here we are creating interface's implementations. Just look into the returning function's object
        and the returned one. It's a simple case of "superior/father" object class instantiate.
        The @Bean interface says to Spring Framework the method are creating a bean object.
        Important stuff it's well importing classes to the package.

        Adding @Profile interface Spring is able to know which one choose when application start.
     */

    @Bean
    @Profile({"default", "english"})
    public HelloWorldService helloWorldServiceEnglish() {
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish() {
        return new HelloWorldServiceSpanishImpl();
    }
}
