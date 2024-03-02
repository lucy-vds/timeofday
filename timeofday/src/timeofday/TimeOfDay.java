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
	 * @invar | 0 <= minutenSindsMiddernacht && minutenSindsMiddernacht < 24*60
	 */
	private int minutenSindsMiddernacht;
	
	public int getUren() {
		return minutenSindsMiddernacht / 60;
	}
	
	public int getMinuten() {
		return minutenSindsMiddernacht % 60;
	}
	
	public int getMinutenSindsMiddernacht() {
		return minutenSindsMiddernacht;
	}
	
	/**
	 * Initialiseert dit object met de gegeven uren en minuten
	 * 
	 * @throws IllegalArgumentException | !(0 <= initiëleUren && initiëleUren <= 23)
	 * @throws IllegalArgumentException | !(0 <= initiëleMinuten && initiëleMinuten <= 59)
	 * 
	 * @post Het uur van het nieuwe object is gelijk aan het gegeven uur.
	 * 		| getUren() == initiëleUren
	 * @post Het aantal minuten van het nieuwe object is gelijk aan de gegeven.
	 * 		| getMinuten() == initiëleMinuten
	 */
	public TimeOfDay(int initiëleUren, int initiëleMinuten) {
		if (initiëleUren < 0)
			throw new IllegalArgumentException("'initialUren' is less then zero");
		if (initiëleUren > 23)
			throw new IllegalArgumentException("'InitiëleUren' is greater than 59");
		if (initiëleMinuten < 0 || initiëleMinuten > 59)
			throw new IllegalArgumentException("'InitëleMinuten' is out of range");
		this.minutenSindsMiddernacht = initiëleUren * 60 + initiëleMinuten;
	}
	
	/**
	 * Stelt het aantal uren in van de gegeven waarden
	 * 
	 * @throws IllegalArgumentException | 0 <= nieuweUren && nieuweUren <= 23
	 * @mutates | this
	 * @post Het aantal uren van dit object is gelijk aan de gegeven waarde
	 * 		| getUren() == nieuweUren
	 * @post Het aantal minuten blijft ongewijzigd
	 * 		| getMinuten() == old(getMinuten())
	 */
	public void setUren(int nieuweUren) {
		if (nieuweUren < 0)
			throw new IllegalArgumentException("'nieuweUren' is less than 0");
		if (nieuweUren > 23)
			throw new IllegalArgumentException("'nieuweUren' is greater than 23")
		this.minutenSindsMiddernacht = nieuweUren * 60 + getMinuten();
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
		this.minutenSindsMiddernacht -= getMinuten();
		this.minutenSindsMiddernacht += nieuweMinuten;
	}
	
	/**
	 * Stelt de minuten sinds middernacht in op de gegeven waarde
	 * 
	 * @pre | 0 <= nieuweMinutenSindsMiddernacht && nieuweMinutenSindsMiddernacht <= 24 * 60
	 * 
	 * @mutates | this
	 * 
	 * @post | getMinutenSindsMiddernacht() == nieuweMinutenSindsMiddernacht
	 */
	public void setMinutenSindsMiddernacht(int nieuweMinutenSindsMiddernacht) {
		this.minutenSindsMiddernacht = nieuweMinutenSindsMiddernacht;
	}
}

	
	
	
	
	
	
	