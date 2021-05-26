package kodlamaio.northwind.core.utilities.results;

public class ErrorDataResult <T>  extends DataResult<T>{
	//ver1: data + message
	public ErrorDataResult(T data, String message) {
		super(data, false, message);
		
	}
	
	//ver2: data 
	public ErrorDataResult(T data) {
		super(data, false);
	}
	
	//ver3: message
	public ErrorDataResult(String message) {
		super(null, false, message);
	}
	
	//ver4: non data
	public ErrorDataResult() {
		super(null, false);
	}
	
}
//s1. SuccessDataResult → ErrorDataResult ile değiştirelim.
//s2. true → false yazalım.