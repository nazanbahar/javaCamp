package kodlamaio.northwind.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

/*Bizim dış dünya ile iletişim kurduğumuz yer Controllerdır. ex. havalimanı örneği*/
/*servis desteği için operation yazılır. Controller vasıtasıyla methot desteği vermek, multiple frontend service support */
/*Naming Conventions Standard*/
/*Dependency Injection*/
/*ALT+SHIF+S: productService generate field için constructor oluştur.*/
/*Data Göndermek*/

@RestController // "Sen bir Controller'sın!" ,
@RequestMapping("/api/products") // mapping: second controller anatation  → /api/products
public class ProductsController { //Dış dünya ile iletişim kurarken, domain'den gelen isteklerin yönlendirmek için karar noktası.
	
	//this point single(x)→ @Autowired  
	private ProductService productService; //Dependecy Injection - Loosely Coupled - Amaç→ Business katmanına(interface kanalıyla) istekte bulunmak. 
	
	@Autowired    // constructor anotation for multiple service  
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")  //veri isteği 
	public List<Product> getAll(){
		
		return this.productService.getAll(); //data göndermek
	}
}
//domain: kodlama.io/api/products  
