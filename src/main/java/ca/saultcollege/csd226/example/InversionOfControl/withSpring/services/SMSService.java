package ca.saultcollege.csd226.example.InversionOfControl.withSpring.services;

// SMSService.java
public class SMSService implements MessageService {
    @Override
    public String getMessage() {
        return "SMS message";
    }
}
