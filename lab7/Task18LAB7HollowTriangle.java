import java.util.*;
public class Task18LAB7HollowTriangle
{
    public static void main(String []args)
    {
        System.out.print("Enter the height");
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        for(int line=1;line<=height;line++)
        {
            for(int a=line;a<height;a++)
            {
                System.out.print(" ");
            }
            if(line==1||line==2||line==height)
            {
                for(int b=1;b<=line;b++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                for(int c=1;c<=line-2;c++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

            
                