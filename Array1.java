import java.util.Scanner;
public class Array1
{
    public static void main(String []args)
    {
        System.out.print("Enter number");
        Scanner b=new Scanner(System.in);
        int[]a=new int[10];
        int i=0;
        while(i<10)
        {
            a[i]=b.nextInt();
            int count=1;
                while(count<=10)
            {
                System.out.println(a[i]);
            }
       
        }
    }
}
     


 