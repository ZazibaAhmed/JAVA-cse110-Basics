import java.util.*;
public class Task4LAB7
{
    public static void main(String []args)
    {
        System.out.print("Enter a number");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int m=1;m<=col;m++)
            {
                System.out.print(m);
            }
            System.out.println("");
        }
    }
}
       