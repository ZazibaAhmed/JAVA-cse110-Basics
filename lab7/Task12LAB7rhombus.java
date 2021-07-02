import java.util.Scanner;
public class Task12LAB7rhombus
{
    public static void main(String []args)
    {
      System.out.print("Enter 1 number");
      Scanner keyboard=new Scanner(System.in);
      int input=keyboard.nextInt();
      for(int line=1;line<=input;line++)
      {
          for(int i=line;i<input;i++)
          {
              System.out.print(" ");
          }
          for(int j=1;j<=line;j++)
          {
              System.out.print("*");
          }
          if(!(line==1))
          {
              for(int k=1;k<line;k++)
              {
                  System.out.print("*");
              }
          }
          System.out.println();
      }
      for(int x=1;x<input;x++)
      {
          for(int y=1;y<=x;y++)
          {
              System.out.print(" ");
          }
          for(int z=x;z<input;z++)
          {
              System.out.print("*");
          }
          for(int a=x+1;a<input;a++)
          {
              System.out.print("*");
          }
          System.out.println();
      }
    }
}
              
               
              
              
              
              
              
              
              
              
              
              
              
              