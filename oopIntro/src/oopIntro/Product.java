package oopIntro;

public class Product {
	/*
	 *  sablon - identity // Constructor block: yapıcı blok:olması istenilen blok
	 * yazılır.
	 */	
	
	public Product() {
		System.out.println("Constructor Block - Ben çalıştım- yazmasanda varım!");
	}

	// overloading - imza oluşturduk.
	public Product(int id, String name, double unitPrice, String detail) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;

	}

	int id;
	String name;
	double unitPrice;
	String detail;

}
