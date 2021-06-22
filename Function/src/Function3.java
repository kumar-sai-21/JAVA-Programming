/*
 * this is non primitive function which pass the reference when the function is called
 */

class Points
{
    int x;
    int y;
}
public class Function3
{ 
    public static void main(String[] args)
    { 
     
        Points p = new Points();
        
        p.x = 5; p.y = 10;
        System.out.println(p.x +" "+ p.y);
        
        fun(p);
        
        System.out.println(p.x +" "+ p.y);
    } 
    
    public static void fun(Points p)
    {
        
        p.x = 10; p.y = 10;
    }
    
    
} 

