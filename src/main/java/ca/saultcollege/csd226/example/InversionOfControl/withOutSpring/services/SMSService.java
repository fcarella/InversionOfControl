package ca.saultcollege.csd226.example.InversionOfControl.withOutSpring.services;

import ca.saultcollege.csd226.example.InversionOfControl.withOutSpring.services.MessageService;

// SMSService.java
public class SMSService implements MessageService {
    @Override
    public String getMessage() {
        return "SMS message";
    }
}
