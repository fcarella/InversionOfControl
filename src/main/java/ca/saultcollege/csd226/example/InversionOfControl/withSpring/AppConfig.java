package ca.saultcollege.csd226.example.InversionOfControl.withSpring;

// AppConfig.java
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import ca.saultcollege.csd226.example.InversionOfControl.withSpring.services.*;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

//    @Bean("emailService")
    @Bean
    public MessageService emailService() {
        return new EmailService();
    }

//    @Bean("smsService")
    @Bean
    public MessageService smsService() {
        return new SMSService();
    }

    @Bean(name="emailPrinter")
    public MessagePrinter emailPrinter(@Qualifier("emailService") MessageService messageService) {
        return new MessagePrinter(messageService);
    }

    @Bean(name="smsPrinter")
    public MessagePrinter smsPrinter(@Qualifier("smsService") MessageService messageService) {
        return new MessagePrinter(messageService);
    }
}
