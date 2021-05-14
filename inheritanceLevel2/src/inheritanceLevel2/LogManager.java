package inheritanceLevel2;

/**
 * @author User
 * STEP1: UYARI: Code Suistimali
 * s1. If-else
 * STEP2: example: spaghetti code - logla methodu 
 * STEP3:Veritabanına loglamanın iptal edilmesi
 * STEP4: Amac: Clean Code 
 * STEP5: YILDIZLI NOT
 * s1. YLDIZLI NOT:"Birbirinin alternatifi codelar için if yazılmaz."
 * s2. extends edelim.  
 */
public class LogManager {
	//example: spaghetti code - logla methodu  
	public void log(int logType) {
		if(logType ==1) {
			System.out.println("Veritabanına loglandı");
		}else if(logType ==1) {
			System.out.println("Dosyaya loglandı");
		}else {
			System.out.println("Email loglandı");
		}
		
	}
}

//1 - Database
//2 - File
//3 - Email
//UYARI: Code Suistimali 