import java.util.*;
public class Task23LAB7
{
  public static void main(String []args)
  {
    System.out.print("Enter a number");
    Scanner sc=new Scanner(System.in);
    int height=sc.nextInt();
    int x=1;
    for(int line=1;line<=height;line++)
    {
      for(int i=line;i<height;i++)
      {
        System.out.print(" ");
      }
       System.out.print("1");
       if(!(line==1))
       {
           for(int j=1;j<=x;j++)
           {
               System.out.print(" ");
           }
           x=x+2;
           System.out.print(x);
        }
                           
       System.out.println();
    }
    int a=height-1,b=1;x=x-2;
    for(int line2=1;line2<=a;line2++)
    {
        for(int k=1;k<=line2;k++)
        {
            System.out.print(" ");
        }
        System.out.print("1");
        for(int l=line2;l<a;l++)
        {
            System.out.print(" ");
        }
        for(int m=line2;m<=a-2;m++)
        {
            System.out.print(" ");
        }
        if(!(line2==a))
        {
            System.out.print(x);
            x=x-2;
        }
        System.out.println();
    }
  }
}