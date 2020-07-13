package learning.spring.di.services;

public class HelloWorldFactory {
    /*
        This class just execute a dependant action of the class that invoke him and return
        the exact HelloWorldService requested by language string.
     */
    public HelloWorldService createHelloWorldService(String language) {
        HelloWorldService service = null;
        switch (language){
            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                service = new HelloWorldServiceSpanishImpl();
                break;
            case "fr":
                service = new HelloWorldServiceFrenchImpl();
                break;
            case "bin":
                service = new HelloWorldServiceBinaryImpl();
                break;
            default: new HelloWorldServiceEnglishImpl(); // Note: It's defined english greet by default
        }
        return service;
    }
}
