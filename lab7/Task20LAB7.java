import java.util.*;
public class Task20LAB7
{
  public static void main(String []args)
  {
    System.out.print("Enter a number");
    Scanner sc=new Scanner(System.in);
    int height=sc.nextInt();
    int x=1,m=-1;
    for(int line=1;line<=height;line++)
    {
      for(int i=line;i<height;i++)
      {
        System.out.print(" ");
      }
       System.out.print("*");
       if(!((line==1)||(line==height)))
       {
           
           for(int j=1;j<=x;j++)
           {
               System.out.print(" ");
           }
           x=x+2;
       }
       if(!(line==1))
       {
           System.out.print("*");
       }
       if(line==height)
       {
           for(int k=1;k<=m;k++)
           {
               System.out.print("*");
           }
       }
       System.out.println();
       m=m+2;
    }
  }
}

                   
               
            