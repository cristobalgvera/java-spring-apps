package learning.spring.di.config;

import learning.spring.di.services.HelloWorldFactory;
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

        helloWorldFactory() method it's executed starting application. This code just apply a
        factory pattern to creation of HelloWorldServices. We can see that it returns a HelloWorldFactory
        object and it's used below to greet in whatever language the application.properties file say.

        It's important define a profile and use it to the request return for factory.
        (See factory pattern on HelloWorldFactory.java file)
     */

    @Bean
    public HelloWorldFactory helloWorldFactory() {
        return new HelloWorldFactory();
    }

    @Bean
    @Profile({"default", "english"})
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory helloWorldFactory) {
        // Note: argument "en" it's dependant of profile. That's should be ever like this,
        // at least when factory pattern is used.
        return helloWorldFactory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("es");
    }

    @Bean
    @Profile("french")
    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("fr");
    }
    @Bean
    @Profile("binary")
    public HelloWorldService helloWorldServiceBinary(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("bin");
    }

}
