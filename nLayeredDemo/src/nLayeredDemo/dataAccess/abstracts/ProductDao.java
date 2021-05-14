package nLayeredDemo.dataAccess.abstracts;


import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	//urun arama -id ile: hepsiburada örneği
	Product get(int id);
	//array: array, sabit yapılardır. bunun yerine array list
	//array list özel bir dizi yapısı generic yapı hangi tip de çalış
	//nesne gönder in değil integer
	//gerçek sistemde array kullanmıyoruz onun yerine array list
	//list aray list in basei 
	//Product[] getAll(); //ürün listesi -326 ürün
	List<Product> getAll();
	
	
}
