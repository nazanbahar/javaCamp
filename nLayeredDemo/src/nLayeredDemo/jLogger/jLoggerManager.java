package nLayeredDemo.jLogger;

public class jLoggerManager {
	public void log(String message) {
		System.out.println("J Logger ile loglandı " + message);
		
	}
}

/**************************************
 //sisteme dahil edeceğiz. ProductManager'da kullanalım.
		//Projene nasıl dahil edersin. jLoggerMger'a dokunamazsın. Sadece çağrımak istersin.
		//Adapter pattern yazarız. service yok burada.
  
 ****************************************** */
 