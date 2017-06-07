package programmingPrep;

public class WeekOne {
	
	public static void main( String[] args) {
		
		for(int i = 1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FIZZBUZZ");
			}
			else if(i%3==0) {
				
			}
		
			
			if(i%3==0) {
				if(i%3==0 && i%5==0) {
					System.out.println("FIZZBUZZ");
				}
				
				System.out.println( "FIZZ");
			}
			else if (i%5==0) {
				if(i%3==0 && i%5==0) {
					System.out.println("FIZZBUZZ");
				}
				System.out.println("BUZZ");
			}
			
			else {
				System.out.println("Number " + i);
			}
		
			
		}
	}

}
