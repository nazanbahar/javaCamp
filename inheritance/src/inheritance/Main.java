package inheritance;
/**
 * @author User 
 * INHERITANCE - MIRAS 
 * STEP1:  
 * s1. Ikı sınıf var ve bazı operasyonlar ortak yapıya sahip. Inheritance mimarisinden yararlanalım. 
 * s2. Sistemin izin verdiği herşeyde patlarsın. 
 * s3. BackendDeveloper olarak kurallara sıkı bağlı kalmalısın. Codelar; kullanılırken sınırlandırılmalıdır. 
 * s4. Magic Class değil, gerçekte ne varsa onu analiz et! 
 * s5. Müşteri tipini doğru anlamalısın!
 * s6. 
 * STEP2: SURDURULEBILIR YAZILIM ALTYAPISI 
 * s1. özellik tutucu, 
 * s2. operasyon tutucu(musteri kaydetmek)
 * 
 * STEP3: Instance Customer -Deleted
 * 		Customer customer = new Customer(); 
		customer.id = 1;
		customer.firstName ="Engin";
		customer.lastName = "Demiroğ";
		customer.nationalIdentity = "10000000";
		customer.customerNumber = "1334";
		//customer.companyName =""; // (x) hatalı code
* STEP4: UYARI: individualCustomer.id IndividualCustomer extends edildiğinde listelenir.
 STEP5: Overloading 
 Aynı isimde (Add method) iki methodumuz var. Cagırdıgımız method calısır. 
 
 STEP6: Object Oriented Programming - Polymorphism
 s1. Java Polymorphism:
 s2. Tek Base method yazdığımız halde, Çalışma sebebi Polymorphism. 
 s3. Onu extend eden sınıfların referanslarını tutabilir. 
 */
public class Main {

	public static void main(String[] args) {
		//bireysel musteri
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "50001";

		//kurumsal musteri
		CorparateCustomer hepsiburada = new CorparateCustomer();
		hepsiburada.customerNumber = "70001";

		//sendika musterisi 
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "80001";
		
		System.out.println("======================================");
		System.out.println("SINGLE ADD-Customer");
		//eklemek icin - manager -plugin Architecture
		//SINGLE ADD-Customer
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(hepsiburada);  //ticari
		customerManager.add(engin); //bireysel
		customerManager.add(abc); //sendika
		System.out.println("======================================");
		System.out.println("MUTLIPLE ADD -Customer with Array []");
		//MUTLIPLE ADD -Customer with Array
		//array
		Customer[] customers = {engin,abc,hepsiburada};
		customerManager.addMultiple(customers);
		System.out.println("======================================");
	}
}
