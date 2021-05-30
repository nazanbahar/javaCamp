package kodlamaio.northwind.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;


@RestController // "Sen bir Controller'sın!" ,
@RequestMapping("/api/products") // mapping: second controller anotation  → /api/products
public class ProductsController { //Dış dünya ile iletişim kurarken, domain'den gelen isteklerin yönlendirmek için karar noktası.
	
	//this point single(x)→ @Autowired  
	private ProductService productService; //Dependecy Injection - Loosely Coupled - Amaç→ Business katmanına(interface kanalıyla) istekte bulunmak. 
	
	@Autowired //constructor annotation for multiple service  
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	//get getall
	@GetMapping("/getAll") //veri isteği 
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll(); //data göndermek
	}
	
	//post add
	@PostMapping ("/add") 
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
	
	
	//getByProductName
	@GetMapping("/getByProductName")
	public DataResult<Product> 
	getByProductName(@RequestParam String productName){//kullanıcıdan aldığımız bilgi
		return this.productService.getByProductName(productName);
	}
	

	/*service copycode +@RequestParam + @GetMapping*/
	@GetMapping("/getProductNameAndCategoryId")
	public DataResult<Product>
	/*getProductNameOrCategoryId(@RequestParam String productName, @RequestParam int categoryId){* -swagger sırasını hatalı getirdiği için */
	getByProductNameAndCategoryId(@RequestParam("productName") String productName,@RequestParam("categoryId") int categoryId){	
		/*hatayı görmek için sysout*/
		//System.out.println(productName);
		//System.out.println(categoryId);
				
		return this.productService.getByProductNameAndCategoryId
				(productName, categoryId);
	}
	
	
	/*write a controller to the signature in the service : @RequestParam, @GetMapping,return */
	@GetMapping("/getByProductNameContains")
	public DataResult<List<Product>>
	getByProductNameContains(@RequestParam String productName){
		
		return this.productService.getByProductNameContains(productName);
	}
	
	
	/*Pagination-(sayfalama)  --begin--
	 * getAll(pageNo-1, pageSize) → The page number starts from 0, we must write pageNo-1.*/
	@GetMapping("/getAllByPage")
	DataResult<List<Product>>
	getAll(int pageNo, int pageSize){
		
		return this.productService.getAll(pageNo-1, pageSize);
	}
	/*Pagination-(sayfalama) --end--*/
	
	
	/*Sorted-(şarta göre sıralama) --begin--
	 * imza, @GetMapping, 
	 * */
	@GetMapping("/getAllDesc")
	public DataResult<List<Product>> getAllSorted(){
		
		return this.productService.getAllSorted();
	}
	
}


/*
 * summary
 * 1. @RequestParam: parametreyi oku
 * 2. Başına / slash koymayı unutma
 * 3. ikinci yöntem: @RequestMapping("/api/products/")
 * sonda slash eklersek diğer alanlara eklememize gerek kalmaz.
 * 
 * 4. getByProductNameAndCategoryId() methodunda
 * s1. getProductNameOrCategoryId(@RequestParam String productName, @RequestParam int categoryId){* -swagger sırasını hatalı getirdiği için 
 * s2. ("productName") ve ("categoryId") ekledik.
 * getByProductNameAndCategoryId(@RequestParam("productName") String productName,@RequestParam("categoryId") int categoryId){ ekledik.
 * */





//==========================================================================================================
//domain: kodlama.io/api/products  
/*Bizim dış dünya ile iletişim kurduğumuz yer Controllerdır. ex. havalimanı örneği*/
/*servis desteği için operation yazılır. Controller vasıtasıyla methot desteği vermek, multiple frontend service support */
/*Naming Conventions Standard*/
/*Dependency Injection*/
/*ALT+SHIF+S: productService generate field için constructor oluştur.*/
/*Data Göndermek*/

// getAll() methodunda → 
//s1. List<Product> → yerine DataResult<List<Product>>  döndüreceğiz.
//s2. return → prodcutService çağıralım.

// @PostMapping ("/add") → 

// @RequestBody → mappping eşleştirme işi yapar bu notasyon ile yapar.
//Gelen Request in bir body si var. 
//Execute ettiğimizde message gövdesine, parametreleri de bir json datasına döndürürek onları da gönderiyor.


/***********************************************************************************
 * VERSION-1 : ListOfProduct
 * package kodlamaio.northwind.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entities.concretes.Product;


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
 * 
 */

/*********************************************************
 * VERSION:2
 * package kodlamaio.northwind.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;


@RestController // "Sen bir Controller'sın!" ,
@RequestMapping("/api/products") // mapping: second controller anotation  → /api/products
public class ProductsController { //Dış dünya ile iletişim kurarken, domain'den gelen isteklerin yönlendirmek için karar noktası.
	
	//this point single(x)→ @Autowired  
	private ProductService productService; //Dependecy Injection - Loosely Coupled - Amaç→ Business katmanına(interface kanalıyla) istekte bulunmak. 
	
	@Autowired //constructor anotation for multiple service  
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	//get operasyonu
	@GetMapping("/getall") //veri isteği 
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll(); //data göndermek
	}
	
	//post operasyonu
	@PostMapping ("/add") 
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
}

 * 
 * *******************************************************/
