package interfaces;
/**
 * @author User
 *  STEP1: METHODS: add() ve delete() Method yazalım.
 *  s1. parametre verelim.
 *  STEP2: PROJEDE BAĞIMLILIK 
 *  s1. AMAÇ: Loglama işi de yapmak
 *  s2. CustomerManager- Loglamaya bağımlıdır.
 *  s3. LOGLAMA: Loglama bağımlılığı da ekleyelim.
 *
 *  
 *  STEP3: DEPENDENCIES-BAĞIMLILIK: 
 *  s1. Bağımlılık türleri
 *  Dependency: Loosly(gevşek)Coupled & Tightly(katı) Coupled
 *  
 *  s2. AMAÇ: "Katı bağımlılıktan gevşek bağımlılığa çevir."
 *  
 *  STEP4: ATTRIBUTE : 
 *  s1. private ile bağımlılık için attribute ekle.
 *  s2. private Logger loggers;
 *  
 *  STEP5: CONSTRUCTOR 
 *  s1. Oluşturduğumuz parametre, CustomerManager çalıştığında otomatik oluşsun!
 *  s2. Code
	public CustomerManager(Logger loggers) {
		this.loggers = loggers;
	}
 * 
 * STEP6: EXAMPLE-1: Katı Bağımlılık
 * s1. Code
  DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + "veritabanına loglandı");
 * 
 * 
 * STEP7: CONSOLE-PRINT: Main.java
 * s1. Details
 * CustomerManager üzerinden hareket edebilmemiz için onu new CustomerManager() lememiz gerekiyor.(add-update-delete)
 * CustomerManager customerManager = new CustomerManager();
 * s2. CustomerManager içinde bir Customer gerekiyor. Müşterimizi de oluşturalım.
 * Customer engin = new Customer(1, "Engin", "Demiroğ");
 * s3. add methodunu çağıralım. Müşterimizi gönderelim.
 * customerManager.add(engin); 
 * 
 * 
 * s2. Code
 * public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		//EXAMPLE-1: Dependencies-Tightly(katı) Coupled: Customer add + database log
		Customer engin = new Customer(1, " Engin "," Demiroğ ");
		customerManager.add(engin);		
	}
 * 
 * STEP8: CONSOLE- OUTPUT:
Müşteri eklendi  Engin  veritabanına loglandı
Database loglandı Engin Dependencies: Tightly(katı) Coupled : veritabanına loglandı
 * 
 * 
 * STEP9:
//Dependency: Loosly Coupled (Gevşek Bağımlılık) & Tightly Coupled(Katı Bağımlılık)
//Uyarı: Katı bağımlılığı gevşek bağımlılığa çevir.

STEP10:
// EXAMPLE1:PLUS-Veritabanına Loglama: Dependencies: Tightly(katı) Coupled
//	  System.out.println("Müşteri eklendi " + customer.getFirstName() + " veritabanına loglandı");
//	  DatabaseLogger databaseLogger = new DatabaseLogger();
//	  databaseLogger.log(customer.getFirstName() +
//	  " Dependencies: Tightly(katı) Coupled : veritabanına loglandı");  //print
//	  }

STEP11:
//Example-2 : Desing Pattern → Dependency Injection : RUNNING Loosly Coupled (Gevşek Bağımlılık) 
//Example-2-I. dependency-attribute
*
*
*
*/

//Example-3: Using Utils Static: Araclar
//Desing Pattern → Dependency Injection - Runnig: Loosly Coupled (Gevşek Bağımlılık) 
//UYARI: Tekrarlayan foreach codeları Sil- Artık Utils Class'da...
//Multiple[] Add
public class CustomerManager {
	
	//definition: bagimli degisken array[]
	private Logger[] loggers; //multiple[]:loggers
	
	
	// generate-constructor and match reference
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers; //Important: match reference
	}

	//multiple[]:loggers: add method  
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi " + customer.getFirstName());

		//USING: Utils Static - Araclar
		//multiple[]:loggers: calling reference with: FOREACH and Utils Static 
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	//multiple[]:loggers: delete method 
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi" + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getLastName());
	}
}




/********************************************************************

//Example-2) MULTIPLE ADD: multiple[]:loggers//
//Multiple[] Add
public class CustomerManager {
	
	//definition: bagimli degisken array[]
	private Logger[] loggers; //multiple[]:loggers
	
	
	// generate-constructor and match reference
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers; //IMPORTANT: match reference
	}

	// add method - calling reference  
	//Example-3: Desing Pattern → Dependency Injection - Runnig: Loosly Coupled (Gevşek Bağımlılık) 
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi " + customer.getFirstName());
		
		//multiple[]:loggers: calling reference with: FOREACH 
		for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}
	}
	
	//multiple[]:loggers: delete method 
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi" + customer.getFirstName());
		
		//multiple[]:loggers: calling reference with: FOREACH 
		for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}
	}
}
*/
/*****************************************************************
Example-1) SINGLE: Add: single:logger//
public class CustomerManager {
	//definition: bagimli degisken
	private Logger logger; //single:logger
	private Logger[] loggers; //multiple[]:loggers
	
	
	// generate-constructor and match reference
	public CustomerManager(Logger logger) {
		this.logger = logger; //IMPORTANT: match reference
	}

	// add method - calling reference  
	//Example-2: Desing Pattern → Dependency Injection - Runnig: Loosly Coupled (Gevşek Bağımlılık) 
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi " + customer.getFirstName());
		
		//single log: calling reference 
		logger.log(customer.getFirstName());
	}
	
	//single log: delete method 
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi" + customer.getFirstName());
		
		//calling reference
		logger.log(customer.getFirstName());
	}
	
}
*************************************************************/

