package intro;

public class Main {

	public static void main(String[] args) {

		// Variable - camelCase
		// Don't repeat yourself
		// ISTQB Yazılım Testi - If Template:Sınır Analizi else blogu
		// Java’da bellek yönetimi - Garbage Collector(Çöp Toplayıcısı)
		// Stack&Heap
		// Tanımladığımız değişkenler bellekte nerede saklanıyor ?
		// ISTISNAI DURUM: String ise değer tip gibi çalışıyor.(String example)
		// ----------------------
		// Variable - Cities -String example
		String sehir1 = "Ankara";
		String sehir2 = "İstanbul";  
		sehir1 = sehir2;
		sehir2 = "İzmir";
		System.out.println(sehir1);

		// ----------------------
		// Variable - References Type
		// question-1&2: Tasarım Desenleri, Katmanlı Mimari, injection, IoC Container
		// temel konu
		// Referans ve Değer Tipler
		// int, boolean, double,float, byte gibi sayısal veri tipleri değer tiptir.
		// array,class,interface, abstract class gibi yapılar referans tiplerdir.
		// Programda boyutları bildirilmiş değişmez bir değer kullanıyorsak stack,
		// değişebilir bir değer kullanıyorsak heap'de tutulur.
		// Stack'de eşitliğin sol tarafı tanımlı -int[] sayilar1
		// Heap'de ise eşitliğin sağ tarafını tutuyor. - { 1, 2, 3, 4, 5 }
		// stack ile heap'in bağlantısı kurulur,
		// Referans tipler için bellekte veriler adreslerde tutulur.(ex. 101,102)

		// question-1: value type: 20
		System.out.println("---Variable - References Type---");
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);

		// question-2: references type : 100
		int[] sayilar1 = { 1, 2, 3, 4, 5 };
		int[] sayilar2 = { 10, 20, 30, 40, 50 };
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);

		// ----------------------
		// Variable - Manuel List
		System.out.println("---Variable - Manuel List---");
		String kredi1 = "Hızlı Kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "Çiftçi kredisi";
		String kredi5 = "Msb kredisi";
		String kredi6 = "Meb kredisi";
		String kredi7 = "Kültür Bakanlığı kredisi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);

		// Variable - Array []- Dizi - Dynamic Structure
		System.out.println("---Variable - Array[]---");
		String[] krediler = { "Hızlı Kredi", "Mutlu emekli kredisi", "Konut kredisi", "Çiftçi kredisi", "Msb kredisi",
				"Meb kredisi", "Kültür Bakanlığı kredisi", };

		// ----------------------
		// Variable Foreach Loop - Dongu : eleman sayısı kadar döner
		System.out.println("---Variable Foreach Loop---");
		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		// ----------------------
		// Variable For Loop - Sayaç Güdümlü Dongu
		System.out.println("---Variable For Loop---");
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);

		}

		// ----------------------
		// Conditional Blocks -If Template
		System.out.println("---Variable -If Template---");
		// Variable - camelCase
		// Don't repeat yourself
		// ISTQB Yazılım Testi - If Template:Sınır Analizi else blogu
		String internetSubeButonu = "İnternet Şubesi";
		System.out.println(internetSubeButonu);
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;

		if (dolarBugun < dolarDun) {

			System.out.println("Dolar düştü resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar yükseldi resmi");

		} else {
			System.out.println("Dolar eşittir resmi");
		}

		// ----------------------
		// Hello World
		System.out.println("---Hello World---");
		System.out.println("Hello World");
		// auto-code | RunMain
	}

}
