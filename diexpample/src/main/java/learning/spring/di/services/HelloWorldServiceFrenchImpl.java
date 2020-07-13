package learning.spring.di.services;

public class HelloWorldServiceFrenchImpl implements HelloWorldService {
    @Override
    public String getGreetings() {
        return "Bonjour le monde!";
    }
}
