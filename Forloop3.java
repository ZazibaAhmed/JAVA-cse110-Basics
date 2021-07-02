import java.util.Scanner;
public class Forloop3
{
    public static void main(String []args)
    {
        System.out.print("Enter Number");
        Scanner keyboard=new Scanner(System.in);
        int n=keyboard.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter number");
            int k=keyboard.nextInt();
            if(k%3==0)
            {
                System.out.println(k+" "+"is DIVISIBLE");
            }
            else
            {
                System.out.println(k+" "+"is NOT DIVISIBLE");
            }
        }
    }
}
