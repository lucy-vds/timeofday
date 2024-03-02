package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay tenThirty = new TimeOfDay(10,30);
		assertEquals(10, tenThirty.getUren());
		assertEquals(30, tenThirty.getMinuten());
		assertEquals(630, tenThirty.getMinutenSindsMiddernacht());
		
		TimeOfDay elevenThirty = new TimeOfDay(11, tenThirty.getMinuten());
		assertEquals(11, elevenThirty.getUren());
		assertEquals(30, elevenThirty.getMinuten());
		assertEquals(690, elevenThirty.getMinutenSindsMiddernacht());
		
		TimeOfDay elevenFortyFive = elevenThirty.withMinutes(45);
		assertEquals(11, elevenFortyFive.getUren());
		assertEquals(45, elevenFortyFive.getMinuten());
		assertEquals(705, elevenFortyFive.getMinutenSindsMiddernacht());
	}

}
