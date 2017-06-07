package programmingPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProblemTwo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
	    List<Integer> input = new ArrayList<>();
	    input.add(1);
	    input.add(0);
	    input.add(1);
	    input.add(1);
	    input.add(0);
	    input.add(0);
	    
	    List<Integer> zero = new ArrayList<>();
	    List<Integer> one = new ArrayList<>();
	  
		for(int number : input) {
			if(number == 1) {
				one.add(number);
			}
			else if( number == 0) {
				zero.add(number);
			}
			
		}
		
		zero.addAll(one);
		System.out.println(zero.toString());
		System.out.println("Hello");
		
		
	}

}
