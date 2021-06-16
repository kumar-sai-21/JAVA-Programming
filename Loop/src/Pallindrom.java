import java.util.Scanner;

/*
 * Program to check weather a program is palindrome or not
 */
public class Pallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Number ");
		Scanner input=new Scanner(System.in);
		int Number=input.nextInt();
		int temp=Number;
		int rem=0;
		int result=0;
		while(temp!=0)
		{
			
			rem=temp%10;
			result=result*10+rem;
			temp=temp/10;
		}
		System.out.println(result);
		if(result==Number)
		{
			System.out.println("This is palindrome ");
		}
		else
		{
			System.out.println("This is not Pallindrome");
		}
	}

}
