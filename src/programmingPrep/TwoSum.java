package programmingPrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int sum = 10;
		List<Integer> input = new ArrayList< Integer> ();
		input.add(7);
		input.add(2);
		input.add(3);
		input.add(5);
		input.add(1);
		input.add(10);
	    
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < input.size(); i++) {
			map.put(input.get(i), i);
		}
		
		for(int i = 0; i < input.size(); i++) {
			map.put(input.get(i), i);
		}
		List<Integer> indices = new ArrayList<Integer>();

		for( int n = 0  ; n < input.size() ; n++) {
		    Integer num = input.get(n);
			int diff = sum - input.get(n);
			if(map.containsKey(diff)) {
				indices.add(n);
				indices.add(map.get(diff));
			    System.out.println(indices.toString());	
			}
		    
		}
	}
}
