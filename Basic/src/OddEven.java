import java.util.Scanner;
public class OddEven {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=input.nextInt();
        if(num%2==0)
        System.out.println(num +" is a  even number");
        else
        System.out.println(num + " is a odd number");
        input.close();

        
    }

    
}