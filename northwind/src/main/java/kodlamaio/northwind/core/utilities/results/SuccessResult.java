package kodlamaio.northwind.core.utilities.results;

public class SuccessResult extends Result{
	
	//non parameter constructor
	public SuccessResult() {
		super(true); //true
	}
	
	//parameter constructor
	public SuccessResult(String message) {
		super(true, message);  //true + message
	}
}

//s1. extends Result → "Sen bir Result sın"
//s2. SuccessResult→ işlem sonuc başarılı
//s3. birincisi : message vermek istemediğimiz durumda paramteresiz
//s4. ikincisi : message vermek istediğimiz durumda parametreli 
