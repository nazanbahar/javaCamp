package inheritanceLevel2;

/**
 * @author User
 * ALTIN KURAL: 
 * s1. DatabaseLogger logger = new DatabaseLogger(); //Don't Using Concrete Class(x)
 * s2. İş yapan bir sınıf başka sınıfları kullanacaksa; asla somut sınıftan gidilmez. 
 * 		 //v1: Don't Using Concrete Class(x)
		//calling DatabaseLogger logger class
		//DatabaseLogger logger = new DatabaseLogger(); //Don't Using Concrete Class(x)
		//log methodunu cagirdik
		//logger.log();
 */

public class CustomerManager {
	//ADD Method - With Logger Class 
	public void add(Logger logger) {
		//müşteri ekleme kodları
		System.out.println("Müşteri eklendi");
		//LOGGER - Müşteri eklerken Logger İş Sınıfını da Çağırdık!
		logger.log();

	}
	
}
