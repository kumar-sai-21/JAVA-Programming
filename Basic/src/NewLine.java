/*
 * Know the difference Between println & print 
 */
public class NewLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");// here after printing Welcome the cursor will move to next Line to print the next print Statement
		System.out.println("To Java");// here also the same happen the cursor moves to the next line.
		//the Final Output will be in two Different Lines
		
		
		System.out.println();
		
		
		System.out.print("Welcome");// here after printing Welcome the cursor will remain in the same line to print the next print Statement
		System.out.print("To Java");// here also the same happen the cursor moves to the next line.
		// the Final output will be in same one line
		
	}

}
