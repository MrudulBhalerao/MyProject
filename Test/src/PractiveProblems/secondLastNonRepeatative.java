package PractiveProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class secondLastNonRepeatative {

	public static void main(String[] args) {
		//fid second last non repeatative = 'c'
		String s="asciikgg";
		//String s = "ghftbbnhh";
		char[] ch_arr = s.toCharArray();   //string --> char Array
		int K=2;
		int count=0;

		Map<Character, Integer> map=new LinkedHashMap<>(); // map for getting char count
		
		for (char c : ch_arr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);   // if already present
			}else {
				map.put(c, 1);  //if not present count =1
			}
		}
		
		List<Character> countOfChar = new ArrayList<>(); //list to get char appear once
		for(int i=s.length()-1;i>=0;i--) {
			if(map.get(s.charAt(i))<K) {   
				countOfChar.add(s.charAt(i));   //get all char appearing once 
			}
		}
		
		System.out.println(countOfChar.get(1));  // 2nd number[1st index] as string we are traversing in reverse
	}

}
