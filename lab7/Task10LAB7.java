import java.util.*;
public class Task10LAB7
{
    public static void main(String []args)
    {
        System.out.print("Enter a number");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int line=1;line<=row;line++)
        {
          for(int x=line;x<row;x++)
          {
              System.out.print(" ");
          }
          for(int x=1;x<=line;x++)
          {
              System.out.print(x);
              
          }
          if(!(line==1))
          {
          
         int c=line+1;
           for(int z=1;z<line;z++)
              {
                  System.out.print(c);
                  c++;
              }
          }
           System.out.println("");
          }
            
        }
    }
