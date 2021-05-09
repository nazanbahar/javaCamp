package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


/**
 * @author User
 *Lombok ne yapar?
@Data

Çıplak Class kalmasın. 
@Entity : Class'ın hangi katmana denk geldiğini anatasyon la yapar.
Anatasyon, bir classın çalışma anında veya derleme anında, onunla ilgili bilgi toplamak
için kullanılan bir yapıdır.C# - attribute, Angular→ decorator, Java'da anatasyon, Product bir Entit'dir diyoruz.


SPRING ile bu sekilde
UYARI: //büyük küçük harf çok önemli dikkat
AMAC: Hangi alan tabloda hangi alana karşılık geliyor. Onu tanımlıyoruz.
Hangi Tablo? Hangi Coloumn lar?

 */
@Data
@Entity //anatasyon
@Table(name="products") //veritabanında hangi tabloya karşılık geliyor
public class Product {
	
	@Id // anatsyonu çok önemli, işlemler id @Id ye göre yapılır. Primary Key olduğu için.
	@GeneratedValue // Id yi otomatik artırmak için
	@Column(name="product_id")   //veritabanında hangi column'a karşılık
	private int id;
	
	@Column(name="category_id")  //her bir column için ekleve arada boşluk bırak code okunurluğu için
	private int categoryId;
	
	@Column(name="product_name") //büyük küçük harf çok önemli dikkat
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;

	
	public Product() {}
	
	
	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
			String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnit = quantityPerUnit;
	}

	
}


