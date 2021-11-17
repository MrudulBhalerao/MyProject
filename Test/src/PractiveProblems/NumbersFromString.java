package PractiveProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersFromString {

	public static void main(String[] args) {
		// Only digit or character input requried 
		String s = "qwertyuki";
		//String regex= "[0-9]+";
		String regex= "[a-zA-Z]+";
		//find if the string has only digits;
		
		Pattern p =Pattern.compile(regex);
		Matcher m =p.matcher(s);
		
		if(m.matches()) {
            System.out.println("The string contains characters");
		}
		else {
			System.out.println("The string contains digits");
			
		}

	}
}


