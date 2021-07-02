import java.util.*;
public class Task11LAB5
{
    public static void main(String []args)
    {
        System.out.print("Enter 10 numbers");
        Scanner sc=new Scanner(System.in);
        int []a=new int[10];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("Please enter another number");
                    a[i]=sc.nextInt();
                }
            }
        }
        for(int k=0;k<a.length;k++)
        {
            System.out.println(a[k]);
        }
    }
}

                       
                
            
            