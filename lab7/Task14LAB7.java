import java.util.*;
public class Task14LAB7
{
    public static void main(String []args)
    {
        System.out.println("Enter 2 numbers");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();//4
        int col=sc.nextInt();//5
        for(int line=1;line<=row;line++)
        {
           if(line==1||line==row)
           {
              for(int a=1;a<=col;a++)
               {
               System.out.print("*");
               }
           }
           if(!(line==1||line==row))
           {
              System.out.print("*");
              for(int b=1;b<=col-2;b++)
              {
                  System.out.print(" ");
              }
              System.out.print("*");
           }
           System.out.println();
        }
    }
}

        


            
                
