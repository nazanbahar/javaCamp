package interfaces;

//UYARI: Java da Ust Class lar static olmaz. Inner Class Static olabilir.
public class Utils {
	
	public static void runLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
	
	//Example1: Static Class Örneği - Inner Class Static olabilir.
	public static class Something{
		
	}
}

/***********************************
 * 1) Utils: runLoggers() Logger[] Methodu yazmak
 * STEP1: BOŞ METHOD YAZMAK
 * public static void runLoggers(){}
 * STEP2: FOREACH EKLE - Her yerden çağrılsın!
 * s1. Add foreach code
 * for(Logger logger: loggers) {
			logger.log(message);
		}
		s2. UYARI: eklediğimizde zaten neye ihtiyacı varsa onun altını kızartır.
		s3. Sen de o kodları yazmalısın.
STEP3:Logger[] Array Parametre Ver
s1. (Logger[] loggers, String message)
public static void runLoggers(Logger[] loggers, String message) {} 
 *************************************/
 