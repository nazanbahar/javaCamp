package oopIntro;

/**
*  @author User
* 1) Altın Kural: Do not repat yourself - method içine koy!
* PosGre ex. hepsiburada.com ürünler dizide tutulur. veri yönetimi noktalı
* virgül unutma! snippet aslında veri kaynağından gelir.
* 		 * 
* String[] products = { "Lenovo V14", "Lenovo V15", "HP 5", }; int[]
* unitsInStock = { 3, 4, 5, };
* 
* bunu yazmak zorundasın ilk başta... Örnek oluşturma, referans oluşturma(en
* iyi tanım), instance oluşturmak Object Orianted Programming neden parantez
* açıyoruz? Code: Syntax error, insert "( )" to complete Expression KURAL : Bir
* Constructor çalışmak zorunda bu yapıda; sadece biri çalışır.
* Sepete Ekle: Reusable tekrarlanan code - method haline getir paketle isteyen çağırır.
* Özellik tutan class lar yazdık, biz şimdi, 
* YAzılım Prensipleri: SOLID
* Her class sadece bir iş yapar.
* Product class ı özellik tutuyor.
* İş Code larını iş sınıfı oluştur içine çok
* method tutucu, özellik tutucu classlar 
* 
* 2) FOREACH
* foreach Coğulsa dizidir.Sonra Collection 
* Çoğul-tekil isimlendirme Product→ veri türüdür.
* product → alias "Ürünler içerisindeki her ürün için" şeklinde.
* ÇIKTI SORUNU: HP 5 null null 3 
* YILDIZLI NOT: "Class'lar referans tiplerdir."
* MAIN'de bir class'dır.
* 
* 3) UYARI: "Method bir data ya ihtiyaç duyuyorsa içine data gönderelim."
* 
  4) SEPETE EKLE: Aslında biz product'ın bellek adresini yollamış oluyoruz.
 */
public class Main {

	public static void main(String[] args) {

		//V2: Parameters Constructor With Parameters Product Class
		Product product1 = new Product(1, "Lenovo V14",15000,"16 GB Ram"); //Parameters With Product Class
		product1.id = 1;
		product1.name = "Lenovo V14";
		product1.unitPrice = 15000;
		product1.detail = "16 GB Ram";
		
		//V1: Non-Parameters Constructor With Non-Parameters Product Class
		Product product2 = new Product();  //Non-Parameters Product Class
		product2.id = 2;
		product2.name = "Lenovo V15";
		product2.unitPrice = 16000;
		product2.detail = "32 GB Ram";

		Product product3 = new Product();
		product3.id = 3;
		product3.name = "HP 5";
		product3.unitPrice = 10000;
		product3.detail = "8 GB Ram";
		// ARRAY: array'e eklemek
		// Product[] products = {};
		Product[] products = { product1, product2, product3 };
	

		for (Product product : products) {
			System.out.println(product.name);
		}
		System.out.println(products.length);

		Category category1 = new Category();
		category1.name = "Bilgisayar";

		Category category2 = new Category();
		category2.name = "Ev/Bahçe";
		
		
		//USING-CLASS: Class kullanma yöntemi
		ProductManager productManager = new ProductManager();
		
		//CALLING: 2. sayfada çağır.
		//productManager.addToCart();
		//productManager.addToCart();
		//productManager.addToCart();

		//UYARI: "Method bir data ya ihtiyaç duyuyorsa içine data gönderelim."
		//SEPETE EKLE: Aslında biz product'ın bellek adresini yollamış oluyoruz.
		//CALLING product: - SEPETE EKLE: 2. sayfada çağır
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
	}

}