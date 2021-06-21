import java.util.Scanner;

/*
 * Taking user Input From Keyboard 
 */


public class ScannerClassInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource") //this is use to hide the waring  as we have not close the input scanner
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your NAME ");
		String name=input.nextLine();
		
		System.out.println("Enter your Roll No ");
		int Roll=input.nextInt();
		
		System.out.println("Enter your Average Marks ");
		float avgmark=input.nextFloat();
		
		System.out.println("Your Name is "+ name);
		System.out.println("Your ROll No is "+ Roll);
		System.out.println("Your Average Marks is "+ avgmark);
		

		
	}

}
