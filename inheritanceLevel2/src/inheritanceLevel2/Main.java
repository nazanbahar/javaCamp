package inheritanceLevel2;


/**
 * @author User
 * 		// CALLING: spaghetti code - logla method  
		//LogManager logManager = new LogManager();
		//logManager.log(1);
 */
public class Main {

	public static void main(String[] args) {
		
		//CALLING : Class of adding customers in the bank : Extra: Logger Class: log() methods
		//CHOOSE OPTIONS: database - file - email
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new EmailLogger());  // => burada emailloger printini görürsün
		customerManager.add(new Logger());  // => burada ise "ortak konfigürasyon" nu görürsün
	}
}
