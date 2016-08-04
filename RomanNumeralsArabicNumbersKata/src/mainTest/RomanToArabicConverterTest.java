package mainTest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.RomanToArabicConverter;

public class RomanToArabicConverterTest {

	@Test
	public void testWhenConverterIsPassedIThat1IsReturned() {
		assertEquals(1, new RomanToArabicConverter().convert("I"));
	}
	
	@Test
	public void testWhenConverterIsPassedIVThat4IsReturned() {
		assertEquals(4, new RomanToArabicConverter().convert("IV"));
	}
	
	@Test
	public void testWhenConverterIsPassedDThat500IsReturned() {
		assertEquals(500, new RomanToArabicConverter().convert("D"));
	}
	
	@Test
	public void testWhenConverterIsPassedCMThat900IsReturned() {
		assertEquals(900, new RomanToArabicConverter().convert("CM"));
	}
	
	@Test
	public void testWhenConverterIsPassedMThat1000IsReturned() {
		assertEquals(1000, new RomanToArabicConverter().convert("M"));
	}

}
