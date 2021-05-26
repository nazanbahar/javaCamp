package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result{

	
	private T data; 
	
	//version1: constructor with message
	public DataResult(T data, boolean success, String message) {
		super(success, message);  //super→ base class'ın constructorlarını çalıştırmak için
		this.data = data; // this→ içinde bulunduğumuz class
	}

	
	//version2: constructor non message : deleted message
	public DataResult(T data, boolean success) {
		super(success);  
		this.data = data; 
	}
	
	//getter → for data
	public T getData() {
		return this.data;
	}
	
}

//s1. Birden fazla veri tipiyle çalıştığımız noktada;generic yapı kurmalıyız.
//s2. Generic → public class DataResult<T> extends Result{}
//s3. DataResult'a döndüreceği veritipinin ne olduğunu söylüyoruz. 
//s4. private T dataT; //Result class'da olduğu gibi
//s5. getter → for data  data için getter yazalım. message ve succes için Result class ında zaten var.





