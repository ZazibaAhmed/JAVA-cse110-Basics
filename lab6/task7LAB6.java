import java.util.*;
public class task7LAB6
{
    public static void main(String []args)
    {
        System.out.println("Enter 15 numbers between 0-9");
        Scanner sc=new Scanner(System.in);
        int []a=new int[10];
        
        for(int count=0;count<15;count++)
        {
            int index=sc.nextInt();
            a[index]=a[index]+1;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(i+"="+a[i]);
        }
    }
}
        
                    
            
                
            
            
            
            
            

       





    























