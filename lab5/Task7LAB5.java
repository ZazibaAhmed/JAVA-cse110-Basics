import java.util.Scanner;
public class Task7LAB5
{
    public static void main(String []args)
    {
      System.out.print("Enter 10 numbers");
      Scanner keyboard=new Scanner(System.in);
      int []number=new int[10];
      for(int i=0;i<10;i++)
      {
          number[i]=keyboard.nextInt();
      }
      for(int count=9;count>=0&&count<10;count--)
      {
          if(number[count]%2==0)
          {
               System.out.println(number[count]);
               break;
             }
    }
}
}