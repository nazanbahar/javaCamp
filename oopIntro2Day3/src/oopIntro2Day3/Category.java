package oopIntro2Day3;
/**
 * @author User
 * STEP1: 
 * s1. erişim engeli
 * okuma ve yazma getter-setter
 * return döndürür
 * Source getter-setter -after code ile yap.
 * super: class ın bir base i çalıştırır.
 * STEP2:
 * s1. private erişim bildirgeci ekleyelim. Dışardan erişim engeli koyalım.
 * s2. Dışardan bu alanlara erişebilmek için getter ve setter ekleriz.
 * s3. Okuma-yazma methodlarını yazalım.
 * s4. set methodu: void: emir kipi, dışardan değer alınır. Parametre verilir.
 * s5. Java: Type-Safety
 * STEP3: Setter değişiklik
 * s1.Okudugum sayfada : unlem ekleyelim. Tüm sayfalar güncellenecektir.
 */
public class Category {
	private int id;
	private String name;
	
	//non parameter constructor
	public Category() {}
	
	//auto constructor
	public Category(int id, String name) {
		super(); // classın parametresiz base idir.
		this.id = id;
		this.name = name;
	}

	//get methodu
	public int getId() {
		return this.id;
	}
	
	//set methodu: emir kipi void, dışardan değer alınır. Parametre verilir.
	public void setId(int id) {
		//this = class
		this.id = id;
	}
	
	//java type-safety
	public String getName() {
		return this.name; 
	}
	
	//okudugum sayfada : unlem ekleyelim. Tüm sayfalar güncellenecektir.
	public void setName(String name) {
		this.name = name + " ! ";
	}
}
