import java.util.*;
public class Task11LAB7
{
    public static void main(String []args)
    {
        System.out.print("Enter a number");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int z=row;
        for(int line=1;line<=row;line++)
        {
          for(int x=line;x<row;x++)
          {
              System.out.print(" ");
          }
          for(int y=z;y<=row;y++)
          {
              System.out.print(y);
          }
           System.out.println();
           z--;
        }
    }
}
    




              
       