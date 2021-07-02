import java.util.*;
public class Task5LAB7
{
    public static void main(String []args)
    {
        System.out.print("Enter a number");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int x=1;x<=row;x++)
        {
            
            for(int y=1;y<=x;y++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
           
         
    

        