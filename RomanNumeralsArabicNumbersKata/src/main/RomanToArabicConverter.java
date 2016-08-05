package main;

public class RomanToArabicConverter {

	public int convert(String romanNumeral) {
		int romanNumeralLength = romanNumeral.length();
		int arabicNumber = 0;
		int previousRomanNumeralCharacterAsArabic = 0;
		
		
		for(int i = romanNumeralLength - 1; i >= 0; i--){
			if(romanNumeral.charAt(i) == 'M'){
				if(previousRomanNumeralCharacterAsArabic > 1000){
					arabicNumber -= 1000;
				}else{
					arabicNumber += 1000;
				}

				previousRomanNumeralCharacterAsArabic = 1000;
			}
			if(romanNumeral.charAt(i) == 'D'){
				if(previousRomanNumeralCharacterAsArabic > 500){
					arabicNumber -= 500;
				}else{
					arabicNumber += 500;
				}

				previousRomanNumeralCharacterAsArabic = 500;
			}
			if(romanNumeral.charAt(i) == 'C'){
				if(previousRomanNumeralCharacterAsArabic > 100){
					arabicNumber -= 100;
				}else{
					arabicNumber += 100;
				}

				previousRomanNumeralCharacterAsArabic = 100;
			}
			if(romanNumeral.charAt(i) == 'L'){
				if(previousRomanNumeralCharacterAsArabic > 50){
					arabicNumber -= 50;
				}else{
					arabicNumber += 50;
				}

				previousRomanNumeralCharacterAsArabic = 50;
			}
			if(romanNumeral.charAt(i) == 'X'){
				if(previousRomanNumeralCharacterAsArabic > 10){
					arabicNumber -= 10;
				}else{
					arabicNumber += 10;
				}

				previousRomanNumeralCharacterAsArabic = 5;
			}
			if(romanNumeral.charAt(i) == 'V'){
				if(previousRomanNumeralCharacterAsArabic > 5){
					arabicNumber -= 5;
				}else{
					arabicNumber += 5;
				}

				previousRomanNumeralCharacterAsArabic = 5;
			}
			if(romanNumeral.charAt(i) == 'I'){
				if(previousRomanNumeralCharacterAsArabic > 1){
					arabicNumber -= 1;
				}else{
					arabicNumber = arabicNumber + 1;
				}

				previousRomanNumeralCharacterAsArabic = 1;
			}
		}
		
		return arabicNumber;
	}
}
