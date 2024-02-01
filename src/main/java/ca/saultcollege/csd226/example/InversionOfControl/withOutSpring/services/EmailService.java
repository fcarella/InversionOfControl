package ca.saultcollege.csd226.example.InversionOfControl.withOutSpring.services;

// EmailService.java
public class EmailService implements MessageService {
    @Override
    public String getMessage() {
        return "Email message";
    }
}

