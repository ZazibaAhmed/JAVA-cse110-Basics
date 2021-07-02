import java.util.*;
public class Task3LAB7
{
    public static void main(String []args)
    {
        System.out.print("Enter a number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            for(int m=1;m<=y;m++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
       