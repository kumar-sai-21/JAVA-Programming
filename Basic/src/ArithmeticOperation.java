import java.util.Scanner;

/*
 * Various Arithmetic operation of  two number by taking user input 
 */
public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two Number");
		int a=input.nextInt();
		int b=input.nextInt();
		
		int sum= a+b;  //sum of two numbers
		int sub=a-b;// Subtraction of two numbers
		float div=a/b; //Division of two numbers
		int mul=a*b;  //Multiplication of two numbers
		int mod=a%b; //Modulo of two numbers
		
		System.out.println();
		System.out.println("The number entered are " +a+" "+b);
		System.out.println();
		
		System.out.println("Addition of " +a+" "+b+ " is ="+sum);
		System.out.println("Subtraction of " +a+" "+b+ " is ="+sub);
		System.out.println("Division of " +a+" "+b+ " is ="+div);
		System.out.println("Multiplication of " +a+" "+b+ " is ="+mul);
		System.out.println("Modulo of " +a+" "+b+ " is ="+mod);

	}

}
