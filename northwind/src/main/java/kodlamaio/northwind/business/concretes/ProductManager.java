package kodlamaio.northwind.business.concretes;
//import java.awt.print.Pageable;  --deleted import
/**
 * @author User
 *Autowired => Spring, arka planda buna karşılık gelebilebilecek 
 *projede ProductDao nun instance olabilecek bir tane sınıfı üretir ve onu verir. 
 */
import java.util.List;  //for List

import org.springframework.beans.factory.annotation.Autowired; // springframework → spring’den gelir. 
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;  //sorted
import org.springframework.stereotype.Service;  //service anatasyonu import

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;




@Service 
public class ProductManager implements ProductService {

		private ProductDao productDao;
		
	
	@Autowired 
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	//getall
	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>
		(this.productDao.findAll(), "Data listelendi");  
	}

	
	//add
	@Override
	public Result add(Product product) {
		this.productDao.save(product); 
		return new SuccessResult("Ürün eklendi");  
	}
		
	
	/*arayüzün bana gönderdiği parametreleri daoya gönderdik.
	 * aynı işlem yaptık farklı methodları çağırdık*/
	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>
		(this.productDao.getByProductName(productName), "Data listelendi"); 
	}

	
	@Override
	public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
		
		//business rules codes 
		
		return new SuccessDataResult<Product>
		(this.productDao.getByProductNameAndCategory_CategoryId(productName, categoryId), "Data listelendi"); 
	}

	
	//ver.list
	@Override
	public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByProductNameOrCategory_CategoryId(productName, categoryId), "Data listelendi");
	}

	
	@Override
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByCategoryIn(categories), "Data listelendi");
	}


	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByProductNameContains(productName), "Data listelendi");
	}


	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByProductNameStartsWith(productName), "Data listelendi");
	}


	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByNameAndCategory(productName, categoryId), "Data listelendi");
	}

	
	/*Pagination-(sayfalama) ---
	 * <summary>
	 * WARNING:
	 * Pageable import → import org.springframework.data.domain.PageRequest;
	 * return→ .getContent() added
	 * pageNo'da tam olarak istenilen sayfa alınamıyor.
	 * */
	
	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		
		
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		
		return new SuccessDataResult<List<Product>>
		(this.productDao.findAll(pageable).getContent());
	}

	
	/* Sorted(sıralama)  
	 * import for sorted → import org.springframework.data.domain.Sort; 
	 * Sort.by
	 * Direction
	 * ASC : artan(A-Z), DESC: düşen(Z-A)
	 * return → SuccessDataResult 
	 * findAll() → (sort)
	 * imza →  DataResult<List<Product>> getAllSorted()
	 * imzayı controller'da paste et, aynısını döndür.
	 * */
	
	@Override
	public DataResult<List<Product>> getAllSorted() {
		
		Sort sort = Sort.by(Sort.Direction.DESC,"productName");
		return new SuccessDataResult<List<Product>>
		(this.productDao.findAll(sort), "Başarılı");
		
	}
	
}





//===========================================================================================
//s1. getAll() Method changed code
//getAll() Methodunda; List<Product> yerine DataResult<List<Product>> döndüreceğiz.

//s2. first parameter → this.productDao.findAll();
//Herhangi bir parametre vermediğimizde; bizim için bütün dataları getirecektir.

//s3. save() methodu 
//ekleme ve güncelleme işlemleri yapmak için 

//s4.add() methodunda ne döndüreceğiz 
//data olmadığı için SuccessResult() döndüreceğiz. SucccessDataResult() da döndürebiliriz.
//==========================================================================================

/*******************************************************************************************
 * VER-1: ListOfProduct
 * 
 * package kodlamaio.northwind.business.concretes;
 *Autowired => Spring, arka planda buna karşılık gelebilebilecek 
 *projede ProductDao nun instance olabilecek bir tane sınıfı üretir ve onu verir. 

import java.util.List;  //for List

import org.springframework.beans.factory.annotation.Autowired; // springframework → spring’den gelir. 
import org.springframework.stereotype.Service;  //service anatasyonu import

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;



@Service //ProductManager’a anatasyon Vermek - Bu class projede servis görevi görecek diye Springe bilgi veriyoruz.
public class ProductManager implements ProductService {

	
	//dataAccess ProductDao'ya erişmemiz gerekiyor.
	private ProductDao productDao;
	
	
	//multiple constructor injection (Injection olayını yakala)
	@Autowired //amaç instance vermek(C#→ Autofac Business Module benzer. Bu yöntem SOLID'de daha uygun)
	public ProductManager(ProductDao productDao) {//injection for productDao → Generate Constructor For Field
		super();
		this.productDao = productDao;
	}

	

	@Override
	public <List<Product>> getAll() {
		return this.productDao.findAll();  
				
	}

}
  
 ******************************************************************************************/
/* VER-2
package kodlamaio.northwind.business.concretes;
/**
 * @author User
 *Autowired => Spring, arka planda buna karşılık gelebilebilecek 
 *projede ProductDao nun instance olabilecek bir tane sınıfı üretir ve onu verir. 
 
import java.util.List;  //for List

import org.springframework.beans.factory.annotation.Autowired; // springframework → spring’den gelir. 
import org.springframework.stereotype.Service;  //service anatasyonu import

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;


@Service //ProductManager’a annotasyon Vermek - Bu class projede servis görevi görecek diye Springe bilgi veriyoruz.
public class ProductManager implements ProductService {

	//dataAccess ProductDao'ya erişmemiz gerekiyor.
	private ProductDao productDao;
		
	//multiple constructor injection (Injection olayını yakala)
	@Autowired //amaç instance vermek(C#→ Autofac Business Module benzer. Bu yöntem SOLID'de daha uygun)
	public ProductManager(ProductDao productDao) {//injection for productDao → Generate Constructor For Field
		super();
		this.productDao = productDao;
	}

	//getall
	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "data listelendi");  //data + message
	}

	//add
	@Override
	public Result add(Product product) {
		this.productDao.save(product); //save() → add and update
		return new SuccessResult("Ürün eklendi");  //SuccessResult() → message
	}
}

 * */


