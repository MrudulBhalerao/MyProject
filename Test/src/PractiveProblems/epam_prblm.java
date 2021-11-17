package PractiveProblems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class epam_prblm {

	public static void main(String[] args) {
		
		String s = "GHFHRRFRRJSS";
		
		//find the maximum times occuring alphabet = R
		
		char[] c_arr = s.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (char c : c_arr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
		System.out.println(map);
		Integer  maximumOcc = Collections.max(map.values());
		System.out.println(maximumOcc);
	
		for (Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue().equals(maximumOcc)) {
				System.out.println(entry.getKey());
			}
		}
		

	}

}
