import java.util.*;
public class Task8LAB6
{
    public static void main(String []args)
    {
        System.out.print("Enter 10 numbers");
        Scanner sc=new Scanner(System.in);
        int []a=new int[10];
        for(int count=0;count<a.length;count++)
        {
            a[count]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                System.out.print(a[i]+",");
            }
        }
        for(int j=0;j<a.length;j++)
        {
            if(!(j%2==0))
            {
                System.out.print(a[j]+",");
            }
        }
    }
}
