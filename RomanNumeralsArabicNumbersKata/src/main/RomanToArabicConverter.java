package main;

public class RomanToArabicConverter {
	
	private int previousRomanNumeralCharacterAsArabic;
	private int arabicNumber;
	
	public int convert(String romanNumeral) {
		String upperCaseRomanNumeralInput = romanNumeral.toUpperCase();
		if(upperCaseRomanNumeralInput.contains("IIII") || upperCaseRomanNumeralInput.contains("XXXX") 
				|| upperCaseRomanNumeralInput.contains("CCCC") || upperCaseRomanNumeralInput.contains("MMMM")
					|| upperCaseRomanNumeralInput.contains("VV") || upperCaseRomanNumeralInput.contains("LL")
						|| upperCaseRomanNumeralInput.contains("DD")){
			return -1;
		}
		
		int romanNumeralLength = upperCaseRomanNumeralInput.length();
		arabicNumber = 0;
		previousRomanNumeralCharacterAsArabic = 0;
		
		
		for(int i = romanNumeralLength - 1; i >= 0; i--){
			if(upperCaseRomanNumeralInput.charAt(i) == 'M'){
				createArabicNumberFromRomanNumerals(1000);
			}
			if(upperCaseRomanNumeralInput.charAt(i) == 'D'){
				createArabicNumberFromRomanNumerals(500);
			}
			if(upperCaseRomanNumeralInput.charAt(i) == 'C'){
				createArabicNumberFromRomanNumerals(100);
			}
			if(upperCaseRomanNumeralInput.charAt(i) == 'L'){
				createArabicNumberFromRomanNumerals(50);
			}
			if(upperCaseRomanNumeralInput.charAt(i) == 'X'){
				createArabicNumberFromRomanNumerals(10);
			}
			if(upperCaseRomanNumeralInput.charAt(i) == 'V'){
				createArabicNumberFromRomanNumerals(5);
			}
			if(upperCaseRomanNumeralInput.charAt(i) == 'I'){
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
