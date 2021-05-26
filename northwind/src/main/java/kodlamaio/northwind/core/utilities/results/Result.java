package kodlamaio.northwind.core.utilities.results;

public class Result { //super type → aslında soyut görevi görüyor. 
	
	private boolean success;
	private String message;
	
	//constructor - success information - one parameter constructor
	public Result(boolean success) {  
		this.success = success; //giden bilgi ile gelen bilgiyi geçmeliyiz.
	};
	
	
	//calling one parameter constructor
	public Result(boolean success, String message) {
		this(success); //tek parametreli constructor ı çağırdık. Daha güzel version code tekrarı yapmamak için.
		//this.success = success; --iptal
		this.message = message;
	};
	
	
	//dışarıdan erişim için getter setters yazalım. isSuccess = getSuccess
	public boolean isSuccess() {
		return this.success;
	}
	
	
	public String getMessage() {
		return this.message;
	}

}
//s1. result nesnesini yapılandıralım. 
//s2. calling one parameter constructor
//s3. this.success=success oldugunda 2 kere set ederek tekrarladığımız için /do not repeat yourself/
