import java.util.Scanner;
public class Task2LAB5
{
    public static void main(String []args)
    {
        System.out.print("Enter 10 numbers");
            Scanner keyboard=new Scanner(System.in);
        int number[]=new int[10];
        for(int i=0;i<10;i++)
        {
           number[i]=keyboard.nextInt();
        }
        System.out.println("Enter index");
        int index=keyboard.nextInt();
        System.out.println(number[index]);
    }
}
          