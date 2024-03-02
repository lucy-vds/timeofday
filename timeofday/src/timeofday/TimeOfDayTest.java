package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay timeofday = new TimeOfDay(10,30);
		assertEquals(10, timeofday.getUren());
		assertEquals(30, timeofday.getMinuten());
		assertEquals(630, timeofday.getMinutenSindsMiddernacht());
		
		timeofday.setUren(11);
		assertEquals(11, timeofday.getUren());
		assertEquals(30, timeofday.getMinuten());
		assertEquals(690, timeofday.getMinutenSindsMiddernacht());
		
		timeofday.setMinuten(45);
		assertEquals(11, timeofday.getUren());
		assertEquals(45, timeofday.getMinuten());
		assertEquals(705, timeofday.getMinutenSindsMiddernacht());
		
		timeofday.setMinutenSindsMiddernacht(90);
		assertEquals(1, timeofday.getUren());
		assertEquals(30, timeofday.getMinuten());
		assertEquals(90, timeofday.getMinutenSindsMiddernacht());
	}

}
