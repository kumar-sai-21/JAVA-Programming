/*
 * In this x and y is declared inside fun() and it does't reflect outside the fun() function
 * this is called pass value which happens in primitive type
 */

public class PremitiveFunction
{ 
    public static void main(String[] args) 
    { 
     
     fun();
     
     fun();

    } 
    
    public static void fun()
    {
        int x = 5, y = 10;
        
        System.out.println(x+y);
    }
    
    
} 

