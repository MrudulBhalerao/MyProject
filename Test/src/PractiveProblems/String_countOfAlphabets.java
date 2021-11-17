package PractiveProblems;

import java.util.HashMap;
import java.util.Map;

public class String_countOfAlphabets {

	public static void main(String[] args) {

     String sample= "Java";
     
     char[] ch_arr=sample.toCharArray();
     
     Map<Character,Integer>map = new HashMap<>();
     
     for (char c : ch_arr) {
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);	
		}
		else {
			map.put(c, 1);
		}
	}
     
     for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		System.out.println("Character :"+entry.getKey()+" Count :"+entry.getValue());
	}
}
}
