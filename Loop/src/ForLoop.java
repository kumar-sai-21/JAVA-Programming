import java.util.Scanner;

/*
 * Print 1 to n number using for loop
 */
public class ForLoop {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		for(int i=1;i<n;i++)
		{
			System.out.println(i);
		}
	}

}
