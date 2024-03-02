package timeofday;

/**
 * Elke instantie stelt een tijdstip voor, gegeven door een aantal uren sinds middernacht en een aantal minuten binnen het uur.
 * 
 * @invar Het aantal uren ligt tussen 0 en 23
 * 		| 0 <= getUren() &&
 * 		| getUren() <= 23
 * @invar Het aantal minuten ligt tussen 0 en 59
 * 		| 0 <= getMinuten() &&
 * 		| getMinuten() <= 59
 * @invar | getMinutenSindsMiddernacht() == getUren() * 60 + getMinuten()
 * 
 * @immutable 
 * 
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
	 * Return a new TimeOfDay object whose minutes are the given minutes and whose hours are this object's hours.
	 * 
	 * @pre | 0 <= newMinutes && newMinutes < 60
	 * @post | result != null
	 * @post | result.getUren() == getUren()
	 * @post | result.getMinuten() == newMinutes
	 */
	public TimeOfDay withMinutes(int newMinutes) {
		throw new RuntimeException("not yet implemented");
	}
	
}

	
	
	
	
	
	
	