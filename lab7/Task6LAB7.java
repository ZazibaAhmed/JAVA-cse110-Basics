import java.util.*;
public class Task6LAB7
{
    public static void main(String []args)
    {
        System.out.print("Enter a number");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int line=1;line<=row;line++)
        {
            
            for(int y=1;y<=line;y++)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}