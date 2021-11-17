package PractiveProblems;

public class prb1 {

	public static void main(String[] args) {
		//problem 2: Given a string, reverse the string in a way that special characters are not affected.
//					Input:   str = "A/B$C"
//				   Output:  str = "C/B$A"

		
		String s1 = "A/B$C";
		String reversed ="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			for(int j=s1.length()-1;j>=0;j--) {
					if(s1.charAt(i)=='/' || s1.charAt(i)=='$') {
						continue;
					}
					else {
						if(reversed.contains(String.valueOf(s1.charAt(i)))==false) {
						reversed+=s1.charAt(i);
					}
					}
				
				
			}
			
		}
		System.out.println(reversed);
		String requiredString ="";
		
		for (int k=0;k<s1.length();k++) {
			for (int l=0;l<reversed.length();l++) {
				if(s1.charAt(k)=='/' || s1.charAt(k)=='$') {
					requiredString+=s1.charAt(k);
					break;
				}
				else {
					requiredString+=reversed.charAt(l);
				}
				
			}
		}
		
		System.out.println(requiredString);
	}
}