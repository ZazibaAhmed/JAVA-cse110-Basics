import java.util.*;
public class Task16LAB7
{
    public static void main(String []args)
    {
        System.out.print("Enter the height");
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        for(int line=1;line<=height;line++)
        {
            if(line==1||line==2||line==height)
            {
                for(int a=1;a<=line;a++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                for(int b=1;b<=line-2;b++)
                {
                    System.out.print(" ");
                }
               System.out.print("*");
            }
            System.out.println();
        }
    }
}

        
        