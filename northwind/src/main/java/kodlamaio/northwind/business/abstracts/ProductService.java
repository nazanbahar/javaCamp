package kodlamaio.northwind.business.abstracts;

import java.util.List;


import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult <List<Product>> getAll();

	/*Pagination-(sayfalama) - pageNo: sayfa no pageSize:Bir sayfada kaç data var.
	 * Bir adet interface methodu ekledik. */
	DataResult <List<Product>> getAll(int pageNo, int pageSize);
	
	/*Sorted-(şarta göre sıralama) --begin--*/
	DataResult <List<Product>> getAllSorted();
	
	
	Result add(Product product);
	
	
	/*Bu yapının iş kodunu yazacağız.*/
	
	//signatures in the service...	
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	
	DataResult<List <Product>> getByProductNameOrCategoryId(String productName, int categoryId);
	
	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);
	
	DataResult<List<Product>>getByProductNameContains(String productName);

	DataResult<List<Product>>getByProductNameStartsWith(String productName);
	
	DataResult<List<Product>>getByNameAndCategory(String productName, int categoryId);
	
}

//===========================================================================
//s1. List<Product> getAll(); yerine DataResult<T> döndüreceğiz. 
//s2. T: tipini belirtelim.

//===========================================================================


/****************************************************************************
 VER-1: ListOfProduct
 * package kodlamaio.northwind.business.abstracts;

import java.util.List;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	<List<Product>> getAll();
}
 ****************************************************************************** 
 */