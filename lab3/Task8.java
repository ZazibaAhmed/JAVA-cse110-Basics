 import java.util.Scanner;
public class Task8
{
    public static void main(String[]args)
    {
        System.out.println("Enter first integer");
     
        Scanner B=new Scanner(System.in);
      int number1=B.nextInt(); 
        System.out.println("Enter second number");
        int number2=B.nextInt();
      
        if(number1>number2){
            double subtraction=number1-number2;
            System.out.print(subtraction);}
        else{
            double subtraction=number2-number1;
            System.out.print(subtraction);}
    }
}