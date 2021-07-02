import java.util.*;
public class Hollowtriangle
{
    public static void main(String []args)
    {
        System.out.print("Enter the height");
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        for(int line=1;line<=height;line++)
        {
            for(int a=1;a<=line;a++)
            {
             if(line==1||line==2||line==height||a==1||a==line)
            {
              System.out.print("*");
             }
             else
             {
                 System.out.print(" ");
             }
            
            }
            System.out.println();
        }
    }
}
                