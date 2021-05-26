package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult <List<Product>> getAll();
	Result add(Product product);
	
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