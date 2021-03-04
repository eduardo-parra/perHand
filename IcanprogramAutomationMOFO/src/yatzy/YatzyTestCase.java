package yatzy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YatzyTestCase {
	@Test
	public void chance() {
		// Arrange
		int[] diceRolls = { 6, 3, 1, 4, 5 };
		// Act
		ResultGenerator gen = new ResultGenerator();
		int result = gen.getResult(diceRolls, 13); // nr 13 är framtida använding av array....ej i bruk nu.
		// Assert
		assertEquals(19, result);
		// nr 19 är det samanlagde numren från diceRolls
	}
}
