import java.util.*;
public class task1LAB6 
{
    public static void main(String []args)
    {
        System.out.println("Enter 5 numbers");
        Scanner keyboard=new Scanner(System.in);
        int []number=new int[5];
        for(int i=0;i<5;i++)
        {
           number[i]=keyboard.nextInt();
        }
        int largest=number[0];
        for(int count=0;count<number.length;count++)
        {
            if(number[count]>largest)
            {
                largest=number[count];
            }
        }
        System.out.println(largest);
    }
}
   
            
        