package kodlamaio.northwind.business.concretes;
/**
 * @author User
 *Autowired => Spring, arka planda buna karşılık gelebilebilecek 
 *projede ProductDao nun instance olabilecek bir tane sınıfı üretir ve onu verir. 
 */
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
