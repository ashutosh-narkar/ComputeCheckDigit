/*
* 08-600
* Homework #2
* Ashutosh Narkar
* September 8, 2012
*/

public class ComputeCheckDigit {
    public static void main(String[] args) {
    	String s = args[0];
    	System.out.println(s);
		
		int a = s.charAt(0) - '0'; // '0' to convert to integer value
		int b = s.charAt(1) - '0';
		int c = s.charAt(2) - '0';
		int d = s.charAt(3) - '0';
		int e = s.charAt(4) - '0';
		int f = s.charAt(5) - '0';
		int g = s.charAt(6) - '0';
		int h = s.charAt(7) - '0';
		int i = s.charAt(8) - '0';
		int j = s.charAt(9) - '0';
		int k = s.charAt(10) -'0';
		
 		long x = (10- (a*3 + b + c*3 + d + e *3 + f + g *3 + h + i*3 + j  + k*3) % 10) % 10;
 		System.out.println("x = "+x );
		
	}
}	
	


