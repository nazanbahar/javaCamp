package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//import com.sun.org.apache.bcel.internal.generic.Select; --error import 

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	
	/*JPQL
	 * getByXName,Id And, Or, In, Contains,StartsWith, @Query
	 * 
	 * */
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);  //getProductNameAndCategoryId olmayacak!  Id silince hata veren Service ve Manager'da altı çizli ise sil.
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);  //sonda getProductNameOrCategoryId olmayacak!
	
	List<Product> getByCategoryIn(List<Integer>categories);  //getByCategoryIdIn olmayacak!
	
	List<Product>getByProductNameContains(String productName);

	List<Product>getByProductNameStartsWith(String productName);

	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
	List<Product>getByNameAndCategory(String productName, int categoryId);
	
	/*
	* JPQL --Altın kural veritabanı tablosunu unut Entity bu. Sanki veritabanı entity miş gibi düşün!
	* parametre geçmek : ? @
	* select * from product where product_name=something and categoryId=something
	 * */
	
}






//interface interface i extends eder. 
//JpaRepository (interface)extends et. 
//verdiğin veri tipi için yani Entity anatasyonu ile süslenmiş, nesne için yani Product,
//Product şart;  ayrıca Primary Key de vermemiz gerekiyor.intelicense ona göre hazırlanıyor.
//SONUC: Ürünle ilgili CRUD Operasyonları hazır.


/*
 s1. bir alana göre data getirmek
 JPA getBy gördüğü andan ilgili colum'a göre WHERE koşulu ekliyor.
 s2. column1 + column2 
 * s3. or operatörü , and operatörü
 * s4. İsimlendirme kurallarına uymamız yaterlidir.
 * s5. select * forom products where product_name = abc and category_id=1
 * s6. where product in(1,2,3,4)
 * s7. list olması gerekmiyor, veri dönüdürebileceğimiz her yapı olur.
 * */
 