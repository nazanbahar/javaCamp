package inheritanceLevel2;

public class DatabaseLogger extends Logger {
	//base sınıf methodu - miras alıp değiştirdim!
	@Override //manuel
	public void log() {
		System.out.println("Database loglandı");
	}
}
