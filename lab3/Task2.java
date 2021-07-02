import java.util.Scanner;
public class Task2
{
    public static void main(String[]args)
    {
        System.out.println("Enter first integer");
        Scanner keyboard=new Scanner(System.in);
        int number1=keyboard.nextInt();
        System.out.println("Enter second integer");
            int number2=keyboard.nextInt();
            
        int sum=number1+number2;
        int product=number1*number2;
        int difference=number1-number2; 
        System.out.println(sum);
        System.out.println(product);
        System.out.println(difference);
    }
}
            