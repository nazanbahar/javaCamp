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
	public List<Product> getAll() {
		return this.productDao.findAll(); //herhangi bir parametre vermediğimizde; bizim için bütün dataları getirecektir.
	}

}
