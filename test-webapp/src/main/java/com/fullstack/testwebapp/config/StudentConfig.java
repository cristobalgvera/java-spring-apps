package com.fullstack.testwebapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration // Annotation to define application properties and his uses
public class StudentConfig {

    /*
        To set, for example, type mismatch for student's form in field age, that means,
        if user type an String in an Integer field, type mismatch error will shows. If
        we don't configure that the message will be large and ugly to an user.

        Also, you can configure, for example, different languages to show in screen messages
        for different locations. So, it´s an useful tool to had.
    */
    @Bean
    public ResourceBundleMessageSource messageSource() {
        // This object is used to analyze inputs before controller got it.
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        // This method is to reference properties file located on 'resources' folder.
        messageSource.setBasenames("properties/messages/student"); // Files must be written without '.properties' string
        return messageSource;
    }
}
