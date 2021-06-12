/*
 * Using Bitwise Operators
 */
public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;   // 0......0 0101
		
		int b=10;  // 0......0 1010
		
		int c=-7;  // 1......1 1010   
		 
		System.out.println("a|b = "+(a|b));//(0......0 0101  |  0......0 1010 )
		System.out.println("a&b ="+(a&b)); //(0......0 0101  &  0......0 1010 )
		
		System.out.println("a&c = "+(a&c)); //(0......0 0101  &  1......1 1010 )
		System.out.println("a|c = "+(a|c)); //(0......0 0101  |  1......1 1010 = 1......1 1111 ) as MSB is 1 it is negative 
											//to know the no convert the result 1......1 1111 to 2's complement
		
		
		
		System.out.println("a^b = "+(a^b));//(0......0 0101  ^  0......0 1010 )
		System.out.println("a^c = "+(a^c));//(0......0 0101  ^  1......1 1010 )
		
		System.out.println("a<<1 ="+(a<<1));
		System.out.println("a>>1 ="+(a>>1));


	}

}
