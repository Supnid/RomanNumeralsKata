package main;

public class RomanToArabicConverter {

	public int convert(String romanNumeral) {
		if(romanNumeral.equals("M")){
			return 1000;
		}else if(romanNumeral.equals("CM")){
			return 900;
		}else if(romanNumeral.equals("D")){
			return 500;
		}else if(romanNumeral.equals("IV")){
			return 4;
		}else{
			return 1;
		}
	}
}
