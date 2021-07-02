import java.util.Scanner;

public class InputExample{  
    public static void main(String[] args){   
        Scanner keyboard = new Scanner ( System.in );
        System.out.println("Please enter an integer number");
        int x; 
        x = keyboard.nextInt();
        
        System.out.println(x);
    }
}

