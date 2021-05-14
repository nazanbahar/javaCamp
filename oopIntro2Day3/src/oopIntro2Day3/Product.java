package oopIntro2Day3;

/**
 * @author User
 * STEP1: Constructorları Silelim.
 * STEP2: Auto Constructor: Generate Constructor Using Fields
 * s1. id> Source > Generate Constructor Using Fields 
 * s1. Choose Select All
 * s2. After Insert Point 
 * s3. Generate
 * STEP3: discount - İndirim Oranı ekleyelim.
 * STEP4: unitPriceAfterDiscount- İndirimden Sonraki Fiyat ekleyelim.
 * STEP5: Manuel sonradan eklediğimiz parametreleri de tanımlayalım.
 * STEP6: EnCapsulation yapmak gerekmektedir.
 * s1. 
 * STEP7: Getter-Setters Methods 
 * s1. Csharp Properties ile aynı islevi gorur.
 *  Java da getter-setter methodlar ile yapılır.
 *  STEP8: final ifadesi ekleyelim. (encapsulation - parameters'da field başına)
 *  STEP9: final yerine private erişim bildirgeci ile değiştirelim.
 *  s1. UYARI: Dışardan başka class'ların erşimesini engelliyoruz. 
 *  s2. Eşittir görevini yapan getter ve setter ile eşitleme yapıyoruz.
 * STE10: Product nesnesinde unitPriceAfterDiscount kullanmıyoruz yerine getter yaazdık.
 * s1. return this.unitPrice-(this.unitPrice*this.discount/100);
 */
public class Product {
	//
	//encapsulation - parameters
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount; //add
	//(X)private double unitPriceAfterDiscount; //add 
	
	//constructor-non parameters 
	public Product () {}
	
	//auto Settings Generate Constructor-Parameters
	public Product(int id, String name, double unitPrice, String detail, double discount) { //add discount, unitPriceAfterDiscount
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount; //manuel
		//(x) this.unitPriceAfterDiscount = unitPriceAfterDiscount; //manuel
		
	}

	
	//auto-getter-setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	//only getter-read
	public double getUnitPriceAfterDiscount() {
		//return unitPriceAfterDiscount;
		//formül 
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}
	
}