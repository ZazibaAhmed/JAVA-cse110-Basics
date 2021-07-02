import java.util.Scanner;
public class Task4
{
    public static void main(String[]args)
    {
    
        Scanner X=new Scanner(System.in);
        int radius=X.nextInt();
       double circumference=2*Math.PI*radius;
        double area=Math.PI*radius*radius;
        System.out.println(circumference);
        System.out.println(area);
    }
}
            
   
            
 