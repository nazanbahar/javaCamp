package interfaces;

/**
 * @author User
 * STEP2: 
 * 	Logger[] loggers = new Logger[] {
				new FileLogger(),new EmailLogger(), 
				new DatabaseLogger(), new SmsLogger()};
		
		//for loop - (for baseLogger)
		for(Logger logger: loggers) {
			logger.log("Log mesajı");
	}

STEP3: 
Example-1: Dependencies-Tightly(katı) Coupled: Customer add + database log

STEP4:
//CustomerManager customerManager = new CustomerManager(new Logger()); 
//Cannot Compiled Code (X): CustomerManager(new Logger());

//CustomerManager'da neyin logunu tutmak istiyorsak burada yazmalıyız. Hepsi değil.
//Logger[] loggers = new Logger[] {new EmailLogger(), new FileLogger(), new DatabaseLogger(),new SmsLogger()}; --all 
 */
public class Main {

	public static void main(String[] args) {
		//CustomerManager customerManager = new CustomerManager(new Logger()); //Don't Using(X): 
		
		
		// Definition: Logger[] - UYARI: CustomerManager'da neyin logunu tutmak istiyorsak...
		Logger[] loggers = new Logger[] {new EmailLogger(), new FileLogger(), new SmsLogger()};
		
		//Calling loggers for CustomerManager 
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer engin = new Customer(1, " Engin " ," Demiroğ ");
		customerManager.add(engin);	
		System.out.println("========================");
		customerManager.delete(engin);
	}
}




