import java.util.Scanner;
public class Task1LAB5
 {
    public static void main(String []args)
    {
        System.out.print("Enter 3 numbers");
        Scanner keyboard=new Scanner(System.in);
        int[]n=new int[3];
        int sum=0;
        
        for(int i=0;i<3;i++)
        {
            n[i]=keyboard.nextInt();
        }
        for(int count=0;count<n.length;count++)
        {
            sum=sum+n[count];
            System.out.println(n[count]);
        }
        System.out.print(sum);
    }
}
