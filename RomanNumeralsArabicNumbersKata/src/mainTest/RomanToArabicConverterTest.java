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
	public void testWhenConverterIsPassedIIThat2IsReturned() {
		assertEquals(2, new RomanToArabicConverter().convert("II"));
	}
	
	@Test
	public void testWhenConverterIsPassedIIIThat3IsReturned() {
		assertEquals(3, new RomanToArabicConverter().convert("III"));
	}
	
	@Test
	public void testWhenConverterIsPassedIVThat4IsReturned() {
		assertEquals(4, new RomanToArabicConverter().convert("IV"));
	}
	
	@Test
	public void testWhenConverterIsPassedIXThat9IsReturned() {
		assertEquals(9, new RomanToArabicConverter().convert("IX"));
	}
	
	@Test
	public void testWhenConverterIsPassedXThat10IsReturned() {
		assertEquals(10, new RomanToArabicConverter().convert("X"));
	}
	
	@Test
	public void testWhenConverterIsPassedXLThat40IsReturned() {
		assertEquals(40, new RomanToArabicConverter().convert("XL"));
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
	
	@Test
	public void testWhenConverterIsPassedMIThat1001IsReturned(){
		assertEquals(1001, new RomanToArabicConverter().convert("MI"));
	}

}
