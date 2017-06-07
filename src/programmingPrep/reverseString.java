package programmingPrep;

public class reverseString {

	    public static void main(String[] args)  {
            String input = "Hello";
            String reversedInput = reverseString(input);
            System.out.println(reversedInput);

        }
	       static String reverseString(String inputString) {
	       char[] inputChar = inputString.toCharArray(); 
	       char[] outputChar = inputString.toCharArray();
	       
           for(int i = 0; i < inputString.length(); i++)  {
        	   outputChar[i] = inputChar[inputString.length()-1-i];
            }
	        return String.valueOf(outputChar);
	    }
	
}
