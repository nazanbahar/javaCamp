package kodlamaio.northwind.business.abstracts;

import java.util.List;


import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductService {
	DataResult <List<Product>> getAll();

	//Pagination-(sayfalama) 
	DataResult <List<Product>> getAll(int pageNo, int pageSize);
	
	//Sorted-(şarta göre sıralama)
	DataResult <List<Product>> getAllSorted();
	
	Result add(Product product);
	
	//signatures in the service...	
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	
	DataResult<List <Product>> getByProductNameOrCategoryId(String productName, int categoryId);
	
	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);
	
	DataResult<List<Product>>getByProductNameContains(String productName);

	DataResult<List<Product>>getByProductNameStartsWith(String productName);
	
	DataResult<List<Product>>getByNameAndCategory(String productName, int categoryId);
	
	
	//dtos
	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
}

