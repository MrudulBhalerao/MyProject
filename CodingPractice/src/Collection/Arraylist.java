package Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		// Finding Second highest number in arrylist
		
			List<Integer> list = new ArrayList<>();
			
			list.add(24);
			list.add(2);
			list.add(48);
			list.add(96);
			
			Collections.sort(list);
			Integer highestNum=Collections.max(list);
			System.out.println(list.get(list.size()-2));
			
		}


	}


