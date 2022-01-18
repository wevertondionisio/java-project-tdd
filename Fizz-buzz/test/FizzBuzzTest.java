import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzzService fizzBuzz;
	
	@Before
	public void setup() throws Exception {
		fizzBuzz = new FizzBuzzService();
	}
	
	
	@Test
	public void fizzBuzzz() throws Exception {
		fizzBuzz = new FizzBuzzService();
		assertEquals("1", fizzBuzz.convert(1));
		assertEquals("2", fizzBuzz.convert(2));
	}

	@Test 
	public void deveConverterParaMultiplosDeTres() throws Exception {
		fizzBuzz = new FizzBuzzService();
		assertEquals("Fizz", fizzBuzz.convert(3));
	}

	@Test 
	public void deveConverterParaMultiplosDeCinco() throws Exception {
		fizzBuzz = new FizzBuzzService();
		assertEquals("Buzz", fizzBuzz.convert(5));
	}

	@Test
	public void deveConverterParaMultiplosDeTresECinco() throws Exception {
		fizzBuzz = new FizzBuzzService();
		assertEquals("FizzBuzz", fizzBuzz.convert(15));
	}
	
}
