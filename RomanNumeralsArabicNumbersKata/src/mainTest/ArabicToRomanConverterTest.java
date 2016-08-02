package mainTest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.ArabicToRomanConverter;

public class ArabicToRomanConverterTest {

	@Test
	public void test() {
		ArabicToRomanConverter converter = new ArabicToRomanConverter();
		assertEquals("I", converter.convert(1));
	}

}
