package föreläsning7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestFizzBuzzer {

	@Test
	public void testWhen1Returns1() {
		// Arrange
		int input = 1;

		// Act
		FizzBuzzer buzzer = new FizzBuzzer();
		String output = buzzer.getValue(input);

		// Assert
		assertEquals("1", output);

	}

	@ParameterizedTest

	@ValueSource(ints = { 1, 2, 4, 7, 8, 11, 13, 14 })
	public void testWhenDefaultReturnsDigit(int input) {
		// Arrange

		// Act
		FizzBuzzer buzzer = new FizzBuzzer();
		String output = buzzer.getValue(input);

		// Assert
		assertEquals(Integer.toString(input), output);

	}

	@ParameterizedTest

	@ValueSource(ints = { 3, 6, 9, 12 })
	public void testWhenD1v3ReturnsFizz(int input) {
		// Arrange
		// int input =3;

		// Act
		FizzBuzzer buzzer = new FizzBuzzer();
		String output = buzzer.getValue(input);

		// Assert
		assertEquals("Fizz", output);

	}

	@ParameterizedTest

	@ValueSource(ints = { 5, 10 })
	public void testWhen5ReturnsBuzz(int input) {
		// Arrange
		// int input = 5;

		// Act
		FizzBuzzer buzzer = new FizzBuzzer();
		String output = buzzer.getValue(input);

		// Assert
		assertEquals("Buzz", output);

	}

	@ParameterizedTest

@ValueSource(ints= {15})
	public void testWhen15ReturnsBuzz(int input) {
		//Arrange
		//int input = 5;
		
		//Act
		FizzBuzzer buzzer = new FizzBuzzer();
		String output = buzzer.getValue(input);
		
		//Assert
		assertEquals("FizzBuzz",output);}
}
