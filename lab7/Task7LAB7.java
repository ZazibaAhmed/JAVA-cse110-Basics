import java.util.*;
public class Task7LAB7
{
    public static void main(String []args)
    {
        System.out.print("Enter a number");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int line=1;line<=row;line++)
        {
            for(int y=line;y<row;y++)
            {
                System.out.print(" ");
            }
            for(int m=1;m<=line;m++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
          