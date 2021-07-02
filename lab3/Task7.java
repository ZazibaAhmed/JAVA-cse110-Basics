 import java.util.Scanner;
public class Task7
{
    public static void main(String[]args)
    {
        System.out.println("Enter first number");
      
        Scanner B=new Scanner(System.in);
      int number1=B.nextInt(); 
        System.out.println("Enter second number");
        int number2=B.nextInt();
        if(number1>number2){
            System.out.print("first is greater");}
        else{
            if(number1==number2){
            System.out.print("numbers are equal");}
            else{
                System.out.print("second is greater");}
        }
    }
}