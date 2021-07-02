import java.util.Scanner;
public class Task9LAB5
{
    public static void main(String []args)
    {
      System.out.print("Enter 10 numbers");
      Scanner keyboard=new Scanner(System.in);
      int []a=new int[5];
      for(int i=0;i<4;i++)
      {
          a[i]=keyboard.nextInt();
      }
      System.out.println("Enter another number");
      int m=keyboard.nextInt();
      for(int i=0;i<a.length-1;i++)
      {
           if(m==a[i])
           {
             System.out.print("yes");
             break;
                             
           }
      }
    }
}
                 
          
            
           