package mainTest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.ArabicToRomanConverter;

public class ArabicToRomanConverterTest {

	@Test
	public void testConverterReturnsAnIWhenGivenAOne() {
		ArabicToRomanConverter converter = new ArabicToRomanConverter();
		assertEquals("I", converter.convert(1));
	}
	
	@Test
	public void testThatWhenTheConverterIsGivenAFiveItReturnsAV(){
		ArabicToRomanConverter converter = new ArabicToRomanConverter();
		assertEquals("V", converter.convert(5));
	}

}
