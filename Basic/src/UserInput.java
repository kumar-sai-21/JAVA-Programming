import java.util.Scanner;

/*
 * Taking user Input From Keyboard 
 */


public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource") //this is use to hide the waring  as we have not close the input scanner
		
		Scanner input= new Scanner(System.in);
		System.out.println("Take the Input NAME");
		String name=input.nextLine();
		System.out.println("Your Name is "+ name);

	}

}
