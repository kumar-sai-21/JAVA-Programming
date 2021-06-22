/*
 * this is non primitive function which pass the reference when the function is called
 */

class Point 
{
    int x;
    int y;
}
public class NonPrimitiveFunction
{ 
    public static void main(String[] args)
    { 
     
        Point p = new Point();
        
        p.x = 5; p.y = 10;
        
        fun(p);
        
        System.out.println(p.x +" "+ p.y);
    } 
    
    public static void fun(Point p)
    {
        p = new Point();//here new reference is created i.e new point
        
        p.x = 10; p.y = 10;
    }
    
    
} 

