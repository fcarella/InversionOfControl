/*
* [chatgpt prompt...](https://chat.openai.com/share/917341c8-3cc1-4fe6-ade9-087d91fd97c0)
* In this example, the control flow is inverted because the Main class is responsible for
* creating instances of MessageService and injecting them into MessagePrinter.
* The choice of which implementation to use is externalized, demonstrating the inversion of
* control principle.
* */
package ca.saultcollege.csd226.example.InversionOfControl.withOutSpring;

import ca.saultcollege.csd226.example.InversionOfControl.withOutSpring.services.EmailService;
import ca.saultcollege.csd226.example.InversionOfControl.withOutSpring.services.MessageService;
import ca.saultcollege.csd226.example.InversionOfControl.withOutSpring.services.SMSService;

public class Main {
    public static void main(String[] args) {
        // Using EmailService
        MessageService emailService = new EmailService();
        MessagePrinter emailPrinter = new MessagePrinter(emailService);
        emailPrinter.printMessage();

        // Using SMSService
        MessageService smsService = new SMSService();
        MessagePrinter smsPrinter = new MessagePrinter(smsService);
        smsPrinter.printMessage();
    }
}
