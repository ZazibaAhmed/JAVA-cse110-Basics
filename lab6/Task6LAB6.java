import java.util.*;
public class Task6LAB6
{
    public static void main(String []args)
    {
        System.out.println("Enter quantity of numbers");
        Scanner keyboard=new Scanner(System.in);
        int q=keyboard.nextInt();
        System.out.print("Enter numbers");
        int []a=new int[q];
        for(int i=0;i<a.length;i++)
        {
           a[i]=keyboard.nextInt();
        }
        int count=0;
        while(count<a.length)
            
        {
          int smallest=a[count],smallestsource=count,index=smallestsource;
          while(index<a.length)
          {
              if(a[index]<smallest)
              {
                  smallest=a[index];
                  smallestsource=index;
              }
              index++;
          }
          a[smallestsource]=a[count];
          a[count]=smallest;
          count++;
        }
        if(a.length%2==0)
        {
            double median;
            double number1=a[a.length/2-1];
            double number2=a[a.length/2];
            median=(number1+number2)/2;
            System.out.print(median);
        }
        else
        {
            int median;
            int x=(a.length/2)+1;
            median=a[x-1];
            System.out.print(median);
        }
    }
}

            
         
