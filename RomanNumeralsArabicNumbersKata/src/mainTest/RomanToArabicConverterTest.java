package mainTest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.RomanToArabicConverter;

public class RomanToArabicConverterTest {

	@Test
	public void testBaseRomanNumeralsAreConvertedCorrectlyToArabicNumbers()
	{	
		RomanToArabicConverter converter = new RomanToArabicConverter();
		assertEquals(1, converter.convert("I"));
		assertEquals(2, converter.convert("II"));
		assertEquals(3, converter.convert("III"));
		assertEquals(4, converter.convert("IV"));
		assertEquals(9, converter.convert("IX"));
		assertEquals(10, converter.convert("X"));
		assertEquals(40, converter.convert("XL"));
		assertEquals(50, converter.convert("L"));
		assertEquals(90, converter.convert("XC"));
		assertEquals(100, converter.convert("C"));
		assertEquals(400, converter.convert("CD"));
		assertEquals(500, converter.convert("D"));
		assertEquals(900, converter.convert("CM"));
		assertEquals(1000, converter.convert("M"));
		assertEquals(1001, converter.convert("MI"));
	}
}
