package ca.saultcollege.csd226.example.InversionOfControl.withoutInversionOfControl;

public class SmsMessagePrinter  implements MessageService{
    @Override
    public String getMessage() {
        return "sms message";
    }
}