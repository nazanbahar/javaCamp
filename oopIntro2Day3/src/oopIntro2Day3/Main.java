package oopIntro2Day3;


/**
 * @author User
 * 3.Gun Java OOP Soyutlama
 * STEP1: Product Class'ında tanımladığımız field lar nedeniyle hata aldık.
 * Burada da atamamız lazım.
 * s1. product1.unitPriceAfterDiscount = 14400; manuel atamamız doğru bir yaklaşım değildir.
 * s2. Matematiksel bir islem sonucunu yazdırmamız gerekmektedir. ReadOnly bir alan olmalı.
 * s3. Bu aşamada encapsulation yapmamız lazım. 
 * s3. Bu alan 
 * 
 * STEP2: Getter -Setter
 * s1. get - okumak
 * s2. set - yazmak
 * 
 * STEP3: 
 * s1. unitPriceAfterDiscount : Indirimden sonraki fiyat Set edilemez! Matematiksel işlem ile gelir.
 * s2. Çinki Product nesnesinde, only getter-read getUnitPriceAfterDiscount() methodu tanımladık.
	
 * STEP3: 
 * s1. Senaryo: bütün categorilerin sonuna ünlem ekle!
 * s2. Dışardan erişim engeli nedeniyle hata aldık! 
 * s3. id yerine → getId(); name yerine → getName(); çalıştırmalıyız.!
 */
public class Main {

	public static void main(String[] args) {
		
		//v2: Parameters Constructor With Parameters Product Class
		Product product1 = new Product(1, "Lenovo V14",15000,"16 GB Ram",10); //Parameters With Product Class
	
		//v1: Non-Parameters Constructor With Non-Parameters Product Class
		// Settting Fields
		Product product2 = new Product(); 
		product1.setId(1);
		product1.setName("Lenova V15");
		product1.setUnitPrice(16000);
		product1.setDetail("16 Gb Ram");
		product1.setDiscount(10);
		//product1.unitPriceAfterDiscount;  Set edilemez
		
		//getUnitPriceAfterDiscount()
		System.out.println(product1.getUnitPriceAfterDiscount());
		System.out.println(product2);
		
		
		//PART-II : Simulation : Tum Category sonuna Unlem ekleyelim.
		//Non Capsulation
		// Dışardan erişim engeli nedeniyle hata aldık!
		//Category category1 = new Category();
		//category1.id=1; 
		//category1.name="İçecek"; 

		//Category category2 = new Category();
		//category1.id=2; 
		//category1.name="Yiyecek"; 
		
		//System.out.println(category1.name + "!"); //manuel !
		//System.out.println(category2.name + "!");
		
		//Category
		Category category1 = new Category();
		category1.setId(1); 
		category1.setName("İçecek"); 

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		//PRINT
		System.out.println(category1.getName() + " - GetName() methodu ");
		System.out.println(category2.getName() + " - GetName() methodu ");
		
		
		
		
	}

}