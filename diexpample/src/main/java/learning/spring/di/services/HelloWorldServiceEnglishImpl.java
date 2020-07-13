package learning.spring.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"english", "default"})
public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public String getGreetings() {
        return "Hello World!";
    }
}
