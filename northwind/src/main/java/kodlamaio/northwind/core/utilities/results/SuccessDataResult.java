package kodlamaio.northwind.core.utilities.results;

public class SuccessDataResult <T> extends DataResult<T>{
	//ver1: data + message
	public SuccessDataResult(T data, String message) {
		super(data, true, message);
		
	}
	
	//ver2: data 
	public SuccessDataResult(T data) {
		super(data, true);
	}
	
	//ver3: message
	public SuccessDataResult(String message) {
		super(null, true, message);
	}
	
	//ver4: non data
	public SuccessDataResult() {
		super(null, true);
	}
	
}
//s1. <T> → generic, data herşey olabilir.
//s2. extends →  DataResult<T>
//s3. SuccessDataResult versiyonunu yazalım.
//s4. boolean success bilgisi istemiyoruz.
//s5. data + message isteyelim.
//s6. super→ data + true + message gönderelim.
//s6. Amaç: Farklı alternatiflerle kullanıcılara imkan sunmak
//s7. Kullanışlı komibasyonları yazalım.