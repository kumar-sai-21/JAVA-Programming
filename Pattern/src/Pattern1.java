/*
 * Triangular Star Pattern
		* 
		* * 
		* * * 
		* * * * 
		* * * * * 
 */
import java.util.Scanner;

public class Pattern1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enetr the no line of Stars ");
		int n=input.nextInt();
		int i, j;
		 
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {
 
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop   
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }
 
            // ending line after each row
            System.out.println();
        }
	}
}



