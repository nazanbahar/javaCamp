package kodlamaio.northwind.entities.dtos; //name calling

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
 * dtos
 * 
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryDto {
	
	private int id;
	private String productName;
	private String categoryName;

}
