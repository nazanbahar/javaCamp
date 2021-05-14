package inheritance;

/**
 * @author User
 *STEP1: ReUsability
 *s1. Amac: Methodları, tekrar tekrar kulanabilmek.
 *s2. Method, body: void , birşey döndürmez. Döndürelecek tip de yapılabilir.
 * s3.kilit nokta - extends etmeseydik yazamazdık!
 * s4. İki ayrı method yazdık.IndividualCustomer ve CorparateCustomer add methodları.
 * s5. Tek Base method yazalım. Base method yazdığımız halde extends ettiğimiz classlar için methodumuz çalıştı. 
 * s6. Önemli Not: Customer, Onu extend eden sınıfların referanslarını tutabilir.
 * STEP2: SOLID - Open Closed Principle
 * s1. Sistem yeni özellik eklendiğinde; mevcut code değişmez.
 * 
 *  STEP3: Bulk Operations
 *  s1. Bulk Insert
 *  s2. Tum Musteri Eklemek - Çoklu Eklemek- Array
 *  
 */
public class CustomerManager {
	
	//super class - base
	public void add (Customer  customer) {
		System.out.println(customer.customerNumber +  " müşteri kaydedildi");
	}
	
	//Bulk Insert : Musterileri Array ile Eklemek
	public void addMultiple(Customer[] customers) {
		//for loop
		for(Customer customer: customers) {
			add(customer);
		}
	}
}
