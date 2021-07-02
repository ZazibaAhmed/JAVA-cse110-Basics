import java.util.*;
public class Task5LAB6
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
          int largest=array[count],largestsource=count,index=largestsource;
          while(index<array.length)
          {
              if(array[index]>largest)
              {
                  largest=array[index];
                  largestsource=index;
              }
              index++;
          }
          array[largestsource]=array[count];
          array[count]=largest;
          count++;
        }
          for(int x=0;x<5;x++)
        {
            System.out.print(array[x]+",");
        }
    }
}


          
                  
                 
            
            
        