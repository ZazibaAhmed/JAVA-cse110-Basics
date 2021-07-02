import java.util.*;
public class Task4LAB6
{
    public static void main(String []args)
    {
        System.out.println("Enter 5 numbers");
        Scanner keyboard=new Scanner(System.in);
        int []array=new int[5];
        for(int i=0;i<5;i++)
        {
           array[i]=keyboard.nextInt();
        }
        int count=0;
        while(count<array.length)
            
        {
          int smallest=array[count],smallestsource=count,index=count;
          while(index<array.length)
          {
              if(array[index]<smallest)
              {
                  smallest=array[index];
                  smallestsource=index;
              }
              index++;
          }
          array[smallestsource]=array[count];
          array[count]=smallest;
          count++;
        }
          for(int x=0;x<5;x++)
        {
            System.out.print(array[x]+",");
        }
    }
}