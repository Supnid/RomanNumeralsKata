package main;

public class ArabicToRomanConverter {

	private String romanNumeralOutput = new String();
	private int userInput;
	
	public String convert(int input) {
		if(input > 3999 || input < 1){
			return "The number you entered could not be converted. Please try another number.";
		}				
		
		userInput = input;
		
		createRomanNumeralString("M", 1000);
		createRomanNumeralString("CM", 900);
		createRomanNumeralString("D", 500);
		createRomanNumeralString("CD", 400);
		createRomanNumeralString("C", 100);
		createRomanNumeralString("XC", 90);
		createRomanNumeralString("L", 50);
		createRomanNumeralString("XL", 40);
		createRomanNumeralString("X", 10);
		createRomanNumeralString("IX", 9);
		createRomanNumeralString("V", 5);
		createRomanNumeralString("IV", 4);
		
		if(userInput > 0){
			for(int i = 0; i < userInput; i++)
				romanNumeralOutput += "I";
		}
		
		return romanNumeralOutput;
	}	
	
	private void createRomanNumeralString(String romanNumeral, int arabicNumber){
		while(userInput >= arabicNumber){
			romanNumeralOutput += romanNumeral;
			userInput -= arabicNumber;
		}
	}

}
