package nLayeredDemo.business.concretes;

import java.util.List;


import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	//hybernate bağlı değilsin. ama referasnı tutan interface bağlısın.
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
		
	}

	
	@Override
	public void add(Product product) {
		//İş kodları
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
			//return: boş ise dön demektir.
		}
		//hybernate bağımlı değiliz.
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi" + product.getName());
		
		//alternatif sistemi dahil edemeyiz. bağımlı bir yapıdır.
		//test senaryolarında; veritabanları sürekli değişir test çalışmaz.
		//dependecy injection: ama DataAccess interface bilir.
	}

	@Override
	public List<Product> getall() {
		return null;
	}

}
