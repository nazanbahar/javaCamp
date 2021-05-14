package oopIntro;

/**
 * @author User
 * 1) sablon - identity // Constructor block: yapıcı blok:olması istenilen blok yazılır.
 * 2) UYARI: 
 * s1. Parameters Constructor ile Parameters Product Class birlikte çalışır.
 * s2. Non-Parameters Constructor ile Non-Parameters Product Class birlikte çalışır.
 * s3. this. class'ı işaret eder.
 * 
 */
public class Product {
	//parameter
	int id;
	String name;
	double unitPrice;
	String detail;
	
	//V1. NON-PARAMETERS - CONSTRUCTOR: NULL
	public Product() {
		System.out.println("Non Parameters Constructor Block - Ben çalıştım- yazmasanda varım!");
	}

	//V2. PARAMETERS - CONSTRUCTOR : OVERLOADING: Imza Olusturduk - Parameters With Product Constructor
	public Product(int id, String name, double unitPrice, String detail) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		//V1: Parameters Constructor With Parameters Product Class
	}

}