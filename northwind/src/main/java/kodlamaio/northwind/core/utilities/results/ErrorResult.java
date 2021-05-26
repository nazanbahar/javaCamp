package kodlamaio.northwind.core.utilities.results;

public class ErrorResult  extends Result{
	//non parameter constructor
	public ErrorResult() {
		super(false); //true
	}
	
	//parameter constructor
	public ErrorResult(String message) {
		super(false, message);  //false + message
	}
}

//s1. extends Result → "Sen bir Result sın"
//s2. ErrorResult→ işlem sonuc başarısız
//s3. birincisi : message vermek istemdiğimiz durumda paramteresiz
//s4. ikincisi : message vermek istediğimiz durumda parametreli 
//s5. true yerine false
//s6. SuccessResult yerine ErrorResult ekleyelim.

