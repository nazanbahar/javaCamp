package inheritanceLevel2;

/**
 * @author User
 * STEP1: @Override Method - Override Etmek 
 * s1. Imzaya uyup, kendine ait codeları yazmaya method override etmek deniyor.
 * s2. Java'da direkt yazdığımızda Override eder. 
 * s3. Ancak, code okunurlugu acisindan @Override yazmamız iyidir.
 * STEP2:log methodu
 * base sınıf methodu - miras alıp değiştireceğim!
	@Override
	public void log() {} 
 */
public class FileLogger extends Logger {
	
	//base sınıf methodu - miras alıp değiştirdim!
	@Override //manuel
	public void log() {
		System.out.println("File loglandı");
	}
}


