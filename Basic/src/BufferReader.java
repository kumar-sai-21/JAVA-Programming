import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Taking input using Bufferclass  
 */
public class BufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String s= br.readLine();	
		System.out.println("Your entered String is "+s);
		System.out.println("ENter the Intergr");
		int x=Integer.parseInt(br.readLine());
		System.out.println("Your Entered Interger is " +x );

	}

}
