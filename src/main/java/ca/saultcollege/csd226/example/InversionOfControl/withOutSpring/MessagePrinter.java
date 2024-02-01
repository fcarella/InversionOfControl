package ca.saultcollege.csd226.example.InversionOfControl.withOutSpring;

import ca.saultcollege.csd226.example.InversionOfControl.withOutSpring.services.MessageService;

// MessagePrinter.java
public class MessagePrinter {
    private final MessageService messageService;

    // Constructor injection
    public MessagePrinter(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }
}
