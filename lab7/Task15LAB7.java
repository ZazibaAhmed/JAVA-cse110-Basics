import java.util.*;
public class Task15LAB7
{
    public static void main(String []args)
    {
        System.out.println("Enter 2 numbers");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        for(int line=1;line<=row;line++)
        {
           if(line==1||line==row)
           {
              for(int a=1;a<=col;a++)
               {
               System.out.print(a);
               }
           }
           if(!(line==1||line==row))
           {
              System.out.print("1");
              for(int b=1;b<=col-2;b++)
              {
                  System.out.print(" ");
              }
              System.out.print(col);
           }
           System.out.println();
        }
    }
}

        


            
                