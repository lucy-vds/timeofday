package timeofday;

/**
 * Elke instantie slaat een tijdstip op, gegeven door een aantal uren sinds middernacht en een aantal minuten binnen het uur.
 * 
 * @invar Het aantal uren ligt tussen 0 en 23
 * 		| 0 <= getUren() &&
 * 		| getUren() <= 23
 * @invar Het aantal minuten ligt tussen 0 en 59
 * 		| 0 <= getMinuten() &&
 * 		| getMinuten() <= 59
 * @invar | getMinutenSindsMiddernacht() == getUren() * 60 + getMinuten()
 */
public class TimeOfDay {
	
	/**
	 * @invar Het aantal uren ligt tussen 0 en 23.
	 * 		| 0 <= uren &&
	 * 		| uren <= 23
	 * @invar Het aantal minuten ligt tussen 0 en 59.
	 * 		| 0 <= minuten && 
	 * 		| minuten <= 59
	 */
	private int uren;
	private int minuten;
	
	public int getUren() { throw new RuntimeException("Not yet implemented"); }
		return uren;
	}
	
	public int getMinuten() { throw new RuntimeException("Not yet implemented"); }
		return minuten;
	}
	
	public int getMiutenSindsMiddernacht() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * Initialiseert dit object met de gegeven uren en minuten
	 * @pre Het aantal uren ligt tussen 0 en 23
	 * 		| 0 <= initiëleUren &&
	 * 		| initiëleUren <= 23
	 * @pre Het aantal minuten ligt tussen 0 en 59
	 * 		| 0 <= initiëleMinuten &&
	 * 		| initiëleMinuten <= 59
	 * @post Het uur van het nieuwe object is gelijk aan het gegeven uur.
	 * 		| getUren() == initiëleUren
	 * @post Het aantal minuten van het nieuwe object is gelijk aan de gegeven.
	 * 		| getMinuten() == initiëleMinuten
	 */
	public TimeOfDay(int initiëleUren, int initiëleMinuten) {
		this.uren = initiëleUren;
		this.minuten = initiëleMinuten;
	}
	
	/**
	 * Stelt het aantal uren in van de gegeven waarden
	 * 
	 * @pre Het aantal uren ligt tussen 0 en 23
	 * 		| 0 <= nieuweUren &&
	 * 		| nieuweUren <= 23
	 * @mutates | this
	 * @post Het aantal uren van dit object is gelijk aan de gegeven waarde
	 * 		| getUren() == nieuweUren
	 * @post Het aantal minuten blijft ongewijzigd
	 * 		| getMinuten() == old(getMinuten())
	 */
	public void setUren(int nieuweUren) {
		this.uren = nieuweUren;
	}
	
	/**
	 * Stelt het aantal minuten in van de gegeven waarden
	 * 
	 * @pre Het aantal minuten ligt tussen 0 en 59
	 * 		| 0 <= nieuweMinuten &&
	 * 		| nieuweMinuten <= 59
	 * @mutates | this
	 * @post Het aantal uren blijft ongewijzigd
	 * 		| getUren() == old(getUren())
	 * @post Het aantal minuten van dit object is gelijk aan de gegeven waarde
	 * 		| getMinuten() == nieuweMinuten
	 */
	public void setMinuten(int nieuweMinuten) {
		this.minuten = nieuweMinuten;
	}
	
	/**
	 * Stelt de minuten sinds middernacht in op de gegeven waarde
	 * 
	 * @pre | 0 <= newMinutenSindsMiddernacht && newMinutenSindsMiddernacht <= 24 * 60
	 * 
	 * @mutates | this
	 * 
	 * @post | getMinutenSindsMiddernacht() == newMinutenSindMiddernacht
	 */
	public void setMinutenSindsMiddernacht(int nieuweMinutenSindsMiddernacht) {
		
	}
}

	
	
	
	
	
	
	