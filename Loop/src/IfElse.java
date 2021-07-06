import java.util.Scanner;

/*
 * Given an integer, , perform the following conditional actions:

If N is odd, print Weird
If N is even and in the inclusive range of 3 to 5, print Not Weird
If N is even and in the inclusive range of 6 to 20 , print Weird
If N is even and greater than 20, print Not Weird
 */
public class IfElse {
	
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	System.out.print("Enter the number");
	        int N = scanner.nextInt();
	        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        if(N%2!=0)
	        {
	            System.out.println("Weird");
	        }
	        else if(N>=3 && N<=5)
	        {
	            System.out.println("Not Weird");
	        }
	        else if (N>=6 && N<=20)
	        {
	             System.out.println("Weird");
	        }
	        else
	        {
	            System.out.println("Not Weird");
	        }
	        scanner.close();
	    }

}
