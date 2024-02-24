// https://www.baeldung.com/spring-boot-console-app
package ca.saultcollege.csd226.example.InversionOfControl.withSpring;

import ca.saultcollege.csd226.example.InversionOfControl.withSpring.services.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class InversionOfControlApplication implements CommandLineRunner {
	private static Logger LOG = LoggerFactory
			.getLogger(InversionOfControlApplication.class);

	public static void main(String[] args) {
		LOG.info("STARTING THE APPLICATION");
		SpringApplication.run(InversionOfControlApplication.class, args);
		LOG.info("APPLICATION FINISHED");
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("EXECUTING : command line runner");

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Retrieve the MessagePrinter bean from the container
		MessageService emailService = context.getBean(EmailService.class);
		MessageService smsService = context.getBean(SMSService.class);


		MessagePrinter emailPrinter1 = new MessagePrinter(emailService);
		emailPrinter1.printMessage();
		MessagePrinter smsPrinter1 = new MessagePrinter(smsService);
		smsPrinter1.printMessage();

		MessagePrinter emailPrinter2 = context.getBean("emailPrinter",MessagePrinter.class);
		emailPrinter2.printMessage();
		MessagePrinter smsPrinter2 = context.getBean("smsPrinter",MessagePrinter.class);
		smsPrinter2.printMessage();

		MessagePrinter emailPrinter3 = new MessagePrinter(context.getBean(EmailService.class));


	}
}