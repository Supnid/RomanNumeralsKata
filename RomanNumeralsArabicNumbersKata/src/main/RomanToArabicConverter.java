package main;

public class RomanToArabicConverter {
	
	private int previousRomanNumeralCharacterAsArabic;
	private int arabicNumber;
	
	public int convert(String romanNumeral) {
		if(romanNumeral.contains("IIII") || romanNumeral.contains("XXXX") || romanNumeral.contains("CCCC") || romanNumeral.contains("MMMM")){
			return -1;
		}
		
		int romanNumeralLength = romanNumeral.length();
		arabicNumber = 0;
		previousRomanNumeralCharacterAsArabic = 0;
		
		
		for(int i = romanNumeralLength - 1; i >= 0; i--){
			if(romanNumeral.charAt(i) == 'M'){
				createArabicNumberFromRomanNumerals(1000);
			}
			if(romanNumeral.charAt(i) == 'D'){
				createArabicNumberFromRomanNumerals(500);
			}
			if(romanNumeral.charAt(i) == 'C'){
				createArabicNumberFromRomanNumerals(100);
			}
			if(romanNumeral.charAt(i) == 'L'){
				createArabicNumberFromRomanNumerals(50);
			}
			if(romanNumeral.charAt(i) == 'X'){
				createArabicNumberFromRomanNumerals(10);
			}
			if(romanNumeral.charAt(i) == 'V'){
				createArabicNumberFromRomanNumerals(5);
			}
			if(romanNumeral.charAt(i) == 'I'){
				createArabicNumberFromRomanNumerals(1);
			}
		}
		
		return arabicNumber;
	}
	
	private void createArabicNumberFromRomanNumerals(int arabicNumberValue){
		if(previousRomanNumeralCharacterAsArabic > arabicNumberValue){
			arabicNumber -= arabicNumberValue;
		}else{
			arabicNumber += arabicNumberValue;
		}
		previousRomanNumeralCharacterAsArabic = arabicNumberValue;
	}
}
