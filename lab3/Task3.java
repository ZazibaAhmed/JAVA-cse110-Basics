import java.util.Scanner;
public class Task3
{
    public static void main(String[]args)
    {
        System.out.println("Enter first number");
        Scanner keyboard=new Scanner(System.in);
        float number1=keyboard.nextFloat();
        System.out.println("Enter second number");
            float number2=keyboard.nextFloat();
            
        float sum=number1+number2;
        float product=number1*number2;
        float difference=number1-number2; 
        System.out.println(sum);
        System.out.println(product);
        System.out.println(difference);
    }
}
            