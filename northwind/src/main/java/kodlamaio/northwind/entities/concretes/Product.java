package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//annotation
@Data
@Entity 
@Table(name="products") 
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)  
	@Column(name="product_id")   
	private int id;
	
	@Column(name="category_id")  
	private int categoryId;
	
	@Column(name="product_name") 
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
}

//summary:
//s1. lombok ile getter-setter silelim.
//s2. non parameter constructor ve full parameter constructor sil. 
//s3. sadece filedlar kalsın.
//s4. @AllArgsConstructor ekle. full parameter constructor a eşit.
//s5. non parameter constructor a eşit.

//uyarılar:
//annotations → büyük küçük harf çok önemli dikkat
//column ekle → code okunurluğu için; her bir column ekledikten sonra arada boşluk bırak. 
//@Data → lombok
//@Entity 
//@Table(name="products")  → veritabanında hangi tabloya karşılık geliyor.
//@NoArgsConstructor
//@AllArgsConstructor

//@Id → anotasyonu çok önemli, işlemler id @Id ye göre yapılır. Primary Key olduğu için.
//@GeneratedValue(strategy= GenerationType.IDENTITY) → Id yi otomatik artırmak için. strategy → Id yi biz artırmıyoruz. 
//@Column(name="product_id") → veritabanında hangi column'a karşılık

/**************************************************************************************************
 Annotations: 
 @Data
 @Entity 
 @Table(name="products")
 @NoArgsConstructor
 @AllArgsConstructor

 @Id
 @GeneratedValue(strategy= GenerationType.IDENTITY)
 @Column(name="product_id")
 
 ****************************************************************************************************/
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

/* ================================================================================================
VER-1: NON - LOMBOK  
package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity //anatasyon
@Table(name="products") //veritabanında hangi tabloya karşılık geliyor.
public class Product {
	
	@Id // anotasyonu çok önemli, işlemler id @Id ye göre yapılır. Primary Key olduğu için.
	@GeneratedValue(strategy= GenerationType.IDENTITY)            // Id yi otomatik artırmak için Strategy→ Id yi biz artırmıyoruz. Otomatik artıyor.
	@Column(name="product_id")   //veritabanında hangi column'a karşılık
	private int id;
	
	@Column(name="category_id")  //code okunurluğu için; her bir column ekledikten sonra arada boşluk bırak. 
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
* ================================================================================================*/

