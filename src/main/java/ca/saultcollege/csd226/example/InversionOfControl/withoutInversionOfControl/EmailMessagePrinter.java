package ca.saultcollege.csd226.example.InversionOfControl.withoutInversionOfControl;

public class EmailMessagePrinter implements MessageService{
    @Override
    public String getMessage() {
        return "email message";
    }
}
