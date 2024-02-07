package ca.saultcollege.csd226.example.InversionOfControl.withoutInversionOfControl;

public class Main {
    public static void main(String[] args) {
        EmailMessagePrinter emp=new EmailMessagePrinter();
        SmsMessagePrinter smp=new SmsMessagePrinter();
        System.out.println(emp.getMessage());
        System.out.println(smp.getMessage());
    }
}
