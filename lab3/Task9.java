import java.util.Scanner;
public class Task9
{
    public static void main(String[]args)
    {
        System.out.println("Enter a number");
        
        Scanner B=new Scanner(System.in);
        int number=B.nextInt();
        
        
        if(number%2==0){
            System.out.print("The number is even");}
        else{
            System.out.print("The number is odd");}
    }
}