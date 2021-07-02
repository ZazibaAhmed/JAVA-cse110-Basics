import java.util.*;
public class practiceSORTING
{
    public static void main(String []args)
    {
        System.out.print("enter 5 numbers");
        Scanner sc=new Scanner(System.in);
        int []a=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        int count=0;
        while(count<5)
        {
           int largest=a[count],largestsource=count,index=count;
           while(index<5)
           {
               if(a[index]>largest)
               {
                   largest=a[index];
                   largestsource=index;
               }
               index++;
           }
           a[largestsource]=a[count];
           a[count]=largest;
           count++;
        }
        for(int x=0;x<a.length;x++)
        {
            System.out.print(a[x]+",");
        }
    }
}

                       
           