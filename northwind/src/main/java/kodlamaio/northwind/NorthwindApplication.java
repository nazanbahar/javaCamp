package kodlamaio.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean; //bean

//import for springfox
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class NorthwindApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindApplication.class, args);
	}
	
	//bkz. https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api 
	//4. Integrating Swagger 2 Into the Project - 4.1. Java Configuration
	  @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("kodlamaio.northwind"))              
	         //.paths(PathSelectors.any())  -- deleted code                         
	          .build();                                           
	    }	
}
//s1. import
//s2. @EnableSwagger2  ekle.