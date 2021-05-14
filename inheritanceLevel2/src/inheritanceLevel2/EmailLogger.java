package inheritanceLevel2;

public class EmailLogger extends Logger {
	//base sınıf methodu - miras alıp değiştirdim!
	@Override //manuel
	public void log() {
		System.out.println("Email gönderildi");
	}
	
}
