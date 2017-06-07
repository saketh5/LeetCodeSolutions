package programmingPrep;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		  
		
		
		List<String> answers = new ArrayList<String>(); 
	    
		int n = 15;
	    for(int i = 1; i <= n; i++) {
	    	if(i%3==0) {
	            if(i%5==0) {
	                answers.add("FIZZBUZZ");
	            }
	            else{ 
	                answers.add("BUZZ"); 
	            }
	           answers.add("FIZZ");
	        }
	    	else {
	    		String num  = Integer.toString(i); 
		        answers.add(num);
	    	}
	    	
	    }
	    System.out.println(answers);
		
	}
}
