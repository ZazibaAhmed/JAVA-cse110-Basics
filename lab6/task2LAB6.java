import java.util.*;
public class task2LAB6 
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
        int largestsofar=number[0];
        int location=0;
        int count=0;
        while(count<number.length)
        {
            if(number[count]>largestsofar)
            {
                largestsofar=number[count];
                location=count;
            }
            count++;
        }
        System.out.println("largest number "+largestsofar+" was found at "+location);
    }
}
       