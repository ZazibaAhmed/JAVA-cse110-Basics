import java.util.*;
public class Task10LAB5
{
    public static void main(String []args)
    {
        System.out.println("Enter 10 numbers");
        Scanner sc=new Scanner(System.in);
        int []a=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
          for(int count=0;count<=i;count++)
          {
             System.out.print(a[count]+",");
          }
          System.out.println();
        }
    }
}
              
              
        
            
    